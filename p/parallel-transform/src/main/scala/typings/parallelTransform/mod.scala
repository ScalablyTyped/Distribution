package typings.parallelTransform

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(maxParallel: Double, opts: Null, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(maxParallel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(maxParallel: Double, opts: Unit, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(maxParallel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(maxParallel: Double, opts: Options, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(maxParallel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(ontransform: OnTransform): Transform = ^.asInstanceOf[js.Dynamic].apply(ontransform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(opts: Double, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: Null, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: Unit, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: Options, ontransform: OnTransform): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], ontransform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Transform {
    def this(ontransform: OnTransform) = this()
    def this(opts: Double, ontransform: OnTransform) = this()
    def this(opts: Null, ontransform: OnTransform) = this()
    def this(opts: Unit, ontransform: OnTransform) = this()
    def this(opts: Options, ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: Null, ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: Unit, ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: Options, ontransform: OnTransform) = this()
  }
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type OnTransform = js.Function2[/* chunk */ Any, /* callback */ TransformCallback, Unit]
  
  trait Options
    extends StObject
       with TransformOptions {
    
    var ordered: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}

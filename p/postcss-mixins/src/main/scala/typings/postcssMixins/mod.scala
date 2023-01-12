package typings.postcssMixins

import org.scalablytyped.runtime.Shortcut
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.mod.Container
import typings.postcss.mod.PluginCreator
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-mixins", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  /**
    * A mixin, either a function or an object
    */
  type Mixin = MixinFn | MixinObj
  
  @js.native
  trait MixinFn extends StObject {
    
    def apply(mixin: Container[ChildNode], args: String*): MixinObj | Unit = js.native
  }
  
  // The Exclude here is meant to make sure that you can't assign invalid functions to MixinObj,
  // which is possible with Record<string, any>
  // tslint:disable-next-line:ban-types
  type MixinObj = Record[String, Exclude[js.Object, js.Function]]
  
  trait Options extends StObject {
    
    /**
      * Define mixins in code instead of with CSS.
      *
      * For functions: the first parameter is the mixin rule,
      * and all others are parameters passed to the mixin.
      */
    var mixins: js.UndefOr[Record[String, Mixin]] = js.undefined
    
    /**
      * Autoload all mixins from one or more dirs.
      * Mixin name will be taken from file name.
      */
    var mixinsDir: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Similar to mixinsDir, except you can provide fast-glob syntax
      * to target or not to target specific files.
      */
    var mixinsFiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Remove unknown mixins instead of throwing an error.
      * Off by default.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMixins(value: Record[String, Mixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsDir(value: String | js.Array[String]): Self = StObject.set(x, "mixinsDir", value.asInstanceOf[js.Any])
      
      inline def setMixinsDirUndefined: Self = StObject.set(x, "mixinsDir", js.undefined)
      
      inline def setMixinsDirVarargs(value: String*): Self = StObject.set(x, "mixinsDir", js.Array(value*))
      
      inline def setMixinsFiles(value: String | js.Array[String]): Self = StObject.set(x, "mixinsFiles", value.asInstanceOf[js.Any])
      
      inline def setMixinsFilesUndefined: Self = StObject.set(x, "mixinsFiles", js.undefined)
      
      inline def setMixinsFilesVarargs(value: String*): Self = StObject.set(x, "mixinsFiles", js.Array(value*))
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
}

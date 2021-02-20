package typings.ncp

import typings.ncp.mod.File
import typings.ncp.ncpBooleans.`true`
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.PathLike
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ncp.ncp.Options & {  errs :node.fs.PathLike} */
  @js.native
  trait OptionserrsPathLike extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.native
    
    var dereference: js.UndefOr[Boolean] = js.native
    
    var errs: js.UndefOr[PathLike] with PathLike = js.native
    
    var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var stopOnErr: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.native
  }
  object OptionserrsPathLike {
    
    @scala.inline
    def apply(errs: js.UndefOr[PathLike] with PathLike): OptionserrsPathLike = {
      val __obj = js.Dynamic.literal(errs = errs.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionserrsPathLike]
    }
    
    @scala.inline
    implicit class OptionserrsPathLikeMutableBuilder[Self <: OptionserrsPathLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      @scala.inline
      def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setErrs(value: js.UndefOr[PathLike] with PathLike): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      @scala.inline
      def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /* Inlined ncp.ncp.Options & {  errs :undefined} */
  @js.native
  trait Optionserrsundefined extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.native
    
    var dereference: js.UndefOr[Boolean] = js.native
    
    var errs: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing] = js.native
    
    var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var stopOnErr: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.native
  }
  object Optionserrsundefined {
    
    @scala.inline
    def apply(errs: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing]): Optionserrsundefined = {
      val __obj = js.Dynamic.literal(errs = errs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionserrsundefined]
    }
    
    @scala.inline
    implicit class OptionserrsundefinedMutableBuilder[Self <: Optionserrsundefined] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      @scala.inline
      def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setErrs(value: js.UndefOr[PathLike] with js.UndefOr[scala.Nothing]): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      @scala.inline
      def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /* Inlined ncp.ncp.Options & {  stopOnErr :true} */
  @js.native
  trait OptionsstopOnErrtrue extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.native
    
    var dereference: js.UndefOr[Boolean] = js.native
    
    var errs: js.UndefOr[PathLike] = js.native
    
    var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var stopOnErr: js.UndefOr[Boolean] with `true` = js.native
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.native
  }
  object OptionsstopOnErrtrue {
    
    @scala.inline
    def apply(stopOnErr: js.UndefOr[Boolean] with `true`): OptionsstopOnErrtrue = {
      val __obj = js.Dynamic.literal(stopOnErr = stopOnErr.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsstopOnErrtrue]
    }
    
    @scala.inline
    implicit class OptionsstopOnErrtrueMutableBuilder[Self <: OptionsstopOnErrtrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      @scala.inline
      def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setErrs(value: PathLike): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrsUndefined: Self = StObject.set(x, "errs", js.undefined)
      
      @scala.inline
      def setFilter(value: RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setStopOnErr(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}

package typings.ncp

import typings.ncp.mod.File
import typings.ncp.ncpBooleans.`true`
import typings.node.fsMod.PathLike
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ncp.ncp.Options & {  errs :node.fs.PathLike} */
  trait OptionserrsPathLike extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] & PathLike
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File, Unit]
      ] = js.undefined
  }
  object OptionserrsPathLike {
    
    inline def apply(errs: js.UndefOr[PathLike] & PathLike): OptionserrsPathLike = {
      val __obj = js.Dynamic.literal(errs = errs.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionserrsPathLike]
    }
    
    extension [Self <: OptionserrsPathLike](x: Self) {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setErrs(value: js.UndefOr[PathLike] & PathLike): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /* Inlined ncp.ncp.Options & {  errs :undefined} */
  trait Optionserrsundefined extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] & Unit
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File, Unit]
      ] = js.undefined
  }
  object Optionserrsundefined {
    
    inline def apply(errs: js.UndefOr[PathLike] & Unit): Optionserrsundefined = {
      val __obj = js.Dynamic.literal(errs = errs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionserrsundefined]
    }
    
    extension [Self <: Optionserrsundefined](x: Self) {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setErrs(value: js.UndefOr[PathLike] & Unit): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /* Inlined ncp.ncp.Options & {  stopOnErr :true} */
  trait OptionsstopOnErrtrue extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] = js.undefined
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] & `true`
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File, Unit]
      ] = js.undefined
  }
  object OptionsstopOnErrtrue {
    
    inline def apply(stopOnErr: js.UndefOr[Boolean] & `true`): OptionsstopOnErrtrue = {
      val __obj = js.Dynamic.literal(stopOnErr = stopOnErr.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsstopOnErrtrue]
    }
    
    extension [Self <: OptionsstopOnErrtrue](x: Self) {
      
      inline def setClobber(value: Boolean): Self = StObject.set(x, "clobber", value.asInstanceOf[js.Any])
      
      inline def setClobberUndefined: Self = StObject.set(x, "clobber", js.undefined)
      
      inline def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setErrs(value: PathLike): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
      
      inline def setErrsUndefined: Self = StObject.set(x, "errs", js.undefined)
      
      inline def setFilter(value: js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setStopOnErr(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: (/* read */ ReadableStream[Any], /* write */ WritableStream[Any], /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}

package typings.ncp

import typings.ncp.mod.File
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ncp.ncp.Options & {  errs :node.fs.PathLike} */
  trait OptionserrsPathLike extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] = js.undefined
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.undefined
  }
  object OptionserrsPathLike {
    
    inline def apply(): OptionserrsPathLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionserrsPathLike]
    }
    
    extension [Self <: OptionserrsPathLike](x: Self) {
      
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
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /* Inlined ncp.ncp.Options & {  errs :undefined} */
  trait Optionserrsundefined extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] = js.undefined
    
    var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.undefined
  }
  object Optionserrsundefined {
    
    inline def apply(): Optionserrsundefined = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionserrsundefined]
    }
    
    extension [Self <: Optionserrsundefined](x: Self) {
      
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
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
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
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.undefined
  }
  object OptionsstopOnErrtrue {
    
    inline def apply(): OptionsstopOnErrtrue = {
      val __obj = js.Dynamic.literal()
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
      
      inline def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      inline def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}

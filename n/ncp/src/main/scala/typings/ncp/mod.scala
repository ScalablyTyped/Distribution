package typings.ncp

import typings.ncp.anon.OptionserrsPathLike
import typings.ncp.anon.Optionserrsundefined
import typings.ncp.anon.OptionsstopOnErrtrue
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(
    source: String,
    destination: String,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    source: String,
    destination: String,
    options: OptionserrsPathLike,
    callback: js.Function1[/* err */ WriteStream | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    source: String,
    destination: String,
    options: Optionserrsundefined,
    callback: js.Function1[/* err */ js.Array[Error] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    source: String,
    destination: String,
    options: OptionsstopOnErrtrue,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ Error | js.Array[Error] | WriteStream | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ncp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ncp", "ncp")
  @js.native
  def ncp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any = js.native
  @scala.inline
  def ncp_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ncp */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ncp")(x.asInstanceOf[js.Any])
  
  /**
    * **NOTE:** This function provides design-time support for util.promisify.
    *
    * It does not exist at runtime.
    */
  @scala.inline
  def promisify(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("__promisify__")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def promisify(source: String, destination: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("__promisify__")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait File extends StObject {
    
    /** Accessed time */
    var atime: Date
    
    var mode: Double
    
    /** Modified time */
    var mtime: Date
    
    var name: String
  }
  object File {
    
    @scala.inline
    def apply(atime: Date, mode: Double, mtime: Date, name: String): File = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var clobber: js.UndefOr[Boolean] = js.undefined
    
    var dereference: js.UndefOr[Boolean] = js.undefined
    
    var errs: js.UndefOr[PathLike] = js.undefined
    
    var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var stopOnErr: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
      ] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      def setStopOnErr(value: Boolean): Self = StObject.set(x, "stopOnErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnErrUndefined: Self = StObject.set(x, "stopOnErr", js.undefined)
      
      @scala.inline
      def setTransform(value: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}

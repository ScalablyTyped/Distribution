package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmBuildSwcMod {
  
  @JSImport("next/dist/esm/build/swc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initCustomTraceSubscriber(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initCustomTraceSubscriber")().asInstanceOf[Unit]
  inline def initCustomTraceSubscriber(traceFileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initCustomTraceSubscriber")(traceFileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isWasm(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWasm")().asInstanceOf[js.Promise[Boolean]]
  
  inline def loadBindings(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadBindings")().asInstanceOf[js.Promise[Unit]]
  
  object lockfilePatchPromise {
    
    @JSImport("next/dist/esm/build/swc", "lockfilePatchPromise")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/esm/build/swc", "lockfilePatchPromise.cur")
    @js.native
    def cur: js.UndefOr[js.Promise[Unit]] = js.native
    inline def cur_=(x: js.UndefOr[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cur")(x.asInstanceOf[js.Any])
  }
  
  inline def minify(src: String, options: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def minifySync(src: String, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("minifySync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(src: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def teardownCrashReporter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("teardownCrashReporter")().asInstanceOf[Unit]
  
  inline def teardownTraceSubscriber(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("teardownTraceSubscriber")().asInstanceOf[Unit]
  
  inline def transform(src: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def transform(src: String, options: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def transformSync(src: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def transformSync(src: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

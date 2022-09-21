package typings.newFindPackageJson

import typings.std.AsyncGenerator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("new-find-package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("new-find-package-json", "find")
  @js.native
  val find: js.Function3[
    /* input */ String, 
    /* base */ js.UndefOr[String], 
    /* fileName */ js.UndefOr[String], 
    AsyncGenerator[String, Unit, Unit]
  ] = js.native
  
  inline def findAsync(input: String): AsyncGenerator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(input.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def findAsync(input: String, base: String): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def findAsync(input: String, base: String, fileName: String): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  inline def findAsync(input: String, base: Unit, fileName: String): AsyncGenerator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAsync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[String, Unit, Unit]]
  
  inline def findSync(input: String): Generator[String, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(input.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Unit]]
  inline def findSync(input: String, base: String): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def findSync(input: String, base: String, fileName: String): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
  inline def findSync(input: String, base: Unit, fileName: String): Generator[String, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSync")(input.asInstanceOf[js.Any], base.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Unit]]
}

package typings.postgresArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postgres-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(source: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parse[T](source: String, transform: js.Function1[/* value */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}

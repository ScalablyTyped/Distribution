package typings.postgresDate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postgres-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Null]
  inline def default(isoDate: String): js.Date | Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(isoDate.asInstanceOf[js.Any]).asInstanceOf[js.Date | Double | Null]
}

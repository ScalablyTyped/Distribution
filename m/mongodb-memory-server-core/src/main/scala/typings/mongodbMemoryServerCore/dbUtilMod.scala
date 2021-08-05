package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbUtilMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(dbName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dbName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateDbName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDbName")().asInstanceOf[String]
  inline def generateDbName(dbName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDbName")(dbName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHost(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHost")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUriBase(host: String, port: Double, dbName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUriBase")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], dbName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isNullOrUndefined(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

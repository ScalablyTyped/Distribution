package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbUtilMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", JSImport.Default)
  @js.native
  def default(): String = js.native
  @JSImport("mongodb-memory-server-core/lib/util/db_util", JSImport.Default)
  @js.native
  def default(dbName: String): String = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", "generateDbName")
  @js.native
  def generateDbName(): String = js.native
  @JSImport("mongodb-memory-server-core/lib/util/db_util", "generateDbName")
  @js.native
  def generateDbName(dbName: String): String = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", "getHost")
  @js.native
  def getHost(uri: String): String = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", "getUriBase")
  @js.native
  def getUriBase(host: String, port: Double, dbName: String): String = js.native
  
  @JSImport("mongodb-memory-server-core/lib/util/db_util", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(`val`: js.Any): Boolean = js.native
}

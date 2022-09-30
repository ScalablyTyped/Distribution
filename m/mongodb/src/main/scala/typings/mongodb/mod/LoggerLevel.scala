package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.info
  - typings.mongodb.mongodbStrings.warn
  - typings.mongodb.mongodbStrings.debug
  - typings.mongodb.mongodbStrings.error
*/
trait LoggerLevel extends StObject
/* Inlined std.Readonly<{ readonly ERROR :'error',  readonly WARN :'warn',  readonly INFO :'info',  readonly DEBUG :'debug',  readonly error :'error',  readonly warn :'warn',  readonly info :'info',  readonly debug :'debug'}> */
object LoggerLevel {
  
  @JSImport("mongodb", "LoggerLevel.DEBUG")
  @js.native
  val DEBUG_ : typings.mongodb.mongodbStrings.debug = js.native
  
  @JSImport("mongodb", "LoggerLevel.ERROR")
  @js.native
  val ERROR_ : typings.mongodb.mongodbStrings.error = js.native
  
  @JSImport("mongodb", "LoggerLevel.INFO")
  @js.native
  val INFO_ : typings.mongodb.mongodbStrings.info = js.native
  
  @JSImport("mongodb", "LoggerLevel.WARN")
  @js.native
  val WARN_ : typings.mongodb.mongodbStrings.warn = js.native
  
  @JSImport("mongodb", "LoggerLevel.debug")
  @js.native
  val debug: typings.mongodb.mongodbStrings.debug = js.native
  
  @JSImport("mongodb", "LoggerLevel.error")
  @js.native
  val error: typings.mongodb.mongodbStrings.error = js.native
  
  @JSImport("mongodb", "LoggerLevel.info")
  @js.native
  val info: typings.mongodb.mongodbStrings.info = js.native
  
  @JSImport("mongodb", "LoggerLevel.warn")
  @js.native
  val warn: typings.mongodb.mongodbStrings.warn = js.native
}

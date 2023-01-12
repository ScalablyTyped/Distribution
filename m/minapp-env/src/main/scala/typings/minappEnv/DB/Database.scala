package typings.minappEnv.DB

import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  val Geo: typings.minappEnv.DB.Geo
  
  def collection(collectionName: String): CollectionReference
  
  val command: DatabaseCommand
  
  val config: ICloudConfig
  
  def serverDate(): ServerDate
}
object Database {
  
  inline def apply(
    Geo: Geo,
    collection: String => CollectionReference,
    command: DatabaseCommand,
    config: ICloudConfig,
    serverDate: () => ServerDate
  ): Database = {
    val __obj = js.Dynamic.literal(Geo = Geo.asInstanceOf[js.Any], collection = js.Any.fromFunction1(collection), command = command.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], serverDate = js.Any.fromFunction0(serverDate))
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Database] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: String => CollectionReference): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setCommand(value: DatabaseCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setGeo(value: Geo): Self = StObject.set(x, "Geo", value.asInstanceOf[js.Any])
    
    inline def setServerDate(value: () => ServerDate): Self = StObject.set(x, "serverDate", js.Any.fromFunction0(value))
  }
}

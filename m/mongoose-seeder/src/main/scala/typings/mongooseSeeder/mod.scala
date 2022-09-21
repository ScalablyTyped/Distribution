package typings.mongooseSeeder

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongoose-seeder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def seed(data: Any, callback: seedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("seed")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def seed(data: Any, options: IOptions): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("seed")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def seed(data: Any, options: IOptions, callback: seedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("seed")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IOptions extends StObject {
    
    var dropCollections: js.UndefOr[Boolean] = js.undefined
    
    var dropDatabase: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setDropCollections(value: Boolean): Self = StObject.set(x, "dropCollections", value.asInstanceOf[js.Any])
      
      inline def setDropCollectionsUndefined: Self = StObject.set(x, "dropCollections", js.undefined)
      
      inline def setDropDatabase(value: Boolean): Self = StObject.set(x, "dropDatabase", value.asInstanceOf[js.Any])
      
      inline def setDropDatabaseUndefined: Self = StObject.set(x, "dropDatabase", js.undefined)
    }
  }
  
  type seedCallback = js.Function2[/* err */ Any, /* dbData */ Any, Unit]
}

package typings.mongooseSeeder

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongoose-seeder", "seed")
  @js.native
  def seed(data: js.Any, callback: seedCallback): Unit = js.native
  @JSImport("mongoose-seeder", "seed")
  @js.native
  def seed(data: js.Any, options: IOptions): Promise[_] = js.native
  @JSImport("mongoose-seeder", "seed")
  @js.native
  def seed(data: js.Any, options: IOptions, callback: seedCallback): Unit = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    var dropCollections: js.UndefOr[Boolean] = js.native
    
    var dropDatabase: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropCollections(value: Boolean): Self = StObject.set(x, "dropCollections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropCollectionsUndefined: Self = StObject.set(x, "dropCollections", js.undefined)
      
      @scala.inline
      def setDropDatabase(value: Boolean): Self = StObject.set(x, "dropDatabase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropDatabaseUndefined: Self = StObject.set(x, "dropDatabase", js.undefined)
    }
  }
  
  type seedCallback = js.Function2[/* err */ js.Any, /* dbData */ js.Any, Unit]
}

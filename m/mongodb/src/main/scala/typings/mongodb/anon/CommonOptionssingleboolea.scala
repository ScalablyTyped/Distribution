package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mongodbStrings.majority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.CommonOptions & {  single :boolean | undefined} */
trait CommonOptionssingleboolea extends StObject {
  
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}
object CommonOptionssingleboolea {
  
  @scala.inline
  def apply(): CommonOptionssingleboolea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptionssingleboolea]
  }
  
  @scala.inline
  implicit class CommonOptionssinglebooleaMutableBuilder[Self <: CommonOptionssingleboolea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setW(value: Double | majority | String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}

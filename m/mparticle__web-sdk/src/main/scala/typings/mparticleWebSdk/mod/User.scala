package typings.mparticleWebSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  def getAllUserAttributes(): AllUserAttributes
  
  /**
    *
    * @deprecated Cart persistence in mParticle has been deprecated
    */
  def getCart(): Cart
  
  def getConsentState(): ConsentState
  
  def getFirstSeenTime(): Double
  
  def getLastSeenTime(): Double
  
  def getMPID(): MPID
  
  def getUserAttributesLists(): Record[String, js.Array[UserAttributesValue]]
  
  def getUserIdentities(): IdentityApiData
  
  def isLoggedIn(): Boolean
  
  def removeAllUserAttributes(): Unit
  
  def removeUserAttribute(key: String): Unit
  
  def removeUserTag(tag: String): Unit
  
  def setConsentState(ConsentState: ConsentState): Unit
  
  def setUserAttribute(key: String, value: String): Unit
  
  def setUserAttributeList(key: String, value: js.Array[UserAttributesValue]): Unit
  
  def setUserAttributes(attributeObject: Record[String, Any]): Unit
  
  def setUserTag(tag: String): Unit
}
object User {
  
  inline def apply(
    getAllUserAttributes: () => AllUserAttributes,
    getCart: () => Cart,
    getConsentState: () => ConsentState,
    getFirstSeenTime: () => Double,
    getLastSeenTime: () => Double,
    getMPID: () => MPID,
    getUserAttributesLists: () => Record[String, js.Array[UserAttributesValue]],
    getUserIdentities: () => IdentityApiData,
    isLoggedIn: () => Boolean,
    removeAllUserAttributes: () => Unit,
    removeUserAttribute: String => Unit,
    removeUserTag: String => Unit,
    setConsentState: ConsentState => Unit,
    setUserAttribute: (String, String) => Unit,
    setUserAttributeList: (String, js.Array[UserAttributesValue]) => Unit,
    setUserAttributes: Record[String, Any] => Unit,
    setUserTag: String => Unit
  ): User = {
    val __obj = js.Dynamic.literal(getAllUserAttributes = js.Any.fromFunction0(getAllUserAttributes), getCart = js.Any.fromFunction0(getCart), getConsentState = js.Any.fromFunction0(getConsentState), getFirstSeenTime = js.Any.fromFunction0(getFirstSeenTime), getLastSeenTime = js.Any.fromFunction0(getLastSeenTime), getMPID = js.Any.fromFunction0(getMPID), getUserAttributesLists = js.Any.fromFunction0(getUserAttributesLists), getUserIdentities = js.Any.fromFunction0(getUserIdentities), isLoggedIn = js.Any.fromFunction0(isLoggedIn), removeAllUserAttributes = js.Any.fromFunction0(removeAllUserAttributes), removeUserAttribute = js.Any.fromFunction1(removeUserAttribute), removeUserTag = js.Any.fromFunction1(removeUserTag), setConsentState = js.Any.fromFunction1(setConsentState), setUserAttribute = js.Any.fromFunction2(setUserAttribute), setUserAttributeList = js.Any.fromFunction2(setUserAttributeList), setUserAttributes = js.Any.fromFunction1(setUserAttributes), setUserTag = js.Any.fromFunction1(setUserTag))
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setGetAllUserAttributes(value: () => AllUserAttributes): Self = StObject.set(x, "getAllUserAttributes", js.Any.fromFunction0(value))
    
    inline def setGetCart(value: () => Cart): Self = StObject.set(x, "getCart", js.Any.fromFunction0(value))
    
    inline def setGetConsentState(value: () => ConsentState): Self = StObject.set(x, "getConsentState", js.Any.fromFunction0(value))
    
    inline def setGetFirstSeenTime(value: () => Double): Self = StObject.set(x, "getFirstSeenTime", js.Any.fromFunction0(value))
    
    inline def setGetLastSeenTime(value: () => Double): Self = StObject.set(x, "getLastSeenTime", js.Any.fromFunction0(value))
    
    inline def setGetMPID(value: () => MPID): Self = StObject.set(x, "getMPID", js.Any.fromFunction0(value))
    
    inline def setGetUserAttributesLists(value: () => Record[String, js.Array[UserAttributesValue]]): Self = StObject.set(x, "getUserAttributesLists", js.Any.fromFunction0(value))
    
    inline def setGetUserIdentities(value: () => IdentityApiData): Self = StObject.set(x, "getUserIdentities", js.Any.fromFunction0(value))
    
    inline def setIsLoggedIn(value: () => Boolean): Self = StObject.set(x, "isLoggedIn", js.Any.fromFunction0(value))
    
    inline def setRemoveAllUserAttributes(value: () => Unit): Self = StObject.set(x, "removeAllUserAttributes", js.Any.fromFunction0(value))
    
    inline def setRemoveUserAttribute(value: String => Unit): Self = StObject.set(x, "removeUserAttribute", js.Any.fromFunction1(value))
    
    inline def setRemoveUserTag(value: String => Unit): Self = StObject.set(x, "removeUserTag", js.Any.fromFunction1(value))
    
    inline def setSetConsentState(value: ConsentState => Unit): Self = StObject.set(x, "setConsentState", js.Any.fromFunction1(value))
    
    inline def setSetUserAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setUserAttribute", js.Any.fromFunction2(value))
    
    inline def setSetUserAttributeList(value: (String, js.Array[UserAttributesValue]) => Unit): Self = StObject.set(x, "setUserAttributeList", js.Any.fromFunction2(value))
    
    inline def setSetUserAttributes(value: Record[String, Any] => Unit): Self = StObject.set(x, "setUserAttributes", js.Any.fromFunction1(value))
    
    inline def setSetUserTag(value: String => Unit): Self = StObject.set(x, "setUserTag", js.Any.fromFunction1(value))
  }
}

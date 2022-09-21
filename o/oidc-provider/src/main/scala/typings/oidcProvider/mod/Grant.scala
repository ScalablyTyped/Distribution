package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.anon.PickGrantopenidresources
import typings.oidcProvider.anon.Scope
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grant
  extends StObject
     with BaseModel {
  
  var accountId: js.UndefOr[String] = js.native
  
  def addOIDCClaims(claims: js.Array[String]): Unit = js.native
  
  def addOIDCScope(scope: String): Unit = js.native
  
  def addResourceScope(resource: String, scope: String): Unit = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  def getOIDCClaims(): js.Array[String] = js.native
  
  def getOIDCClaimsEncountered(): js.Array[String] = js.native
  
  def getOIDCClaimsFiltered(filter: Set[String]): js.Array[String] = js.native
  
  def getOIDCScope(): String = js.native
  
  def getOIDCScopeEncountered(): String = js.native
  
  def getOIDCScopeFiltered(filter: Set[String]): String = js.native
  
  def getResourceScope(resource: String): String = js.native
  
  def getResourceScopeEncountered(resource: String): String = js.native
  
  def getResourceScopeFiltered(resource: String, filter: Set[String]): String = js.native
  
  var openid: js.UndefOr[Scope] = js.native
  
  def rejectOIDCClaims(claims: js.Array[String]): Unit = js.native
  
  def rejectOIDCScope(scope: String): Unit = js.native
  
  def rejectResourceScope(resource: String, scope: String): Unit = js.native
  
  var rejected: js.UndefOr[PickGrantopenidresources] = js.native
  
  var resources: js.UndefOr[StringDictionary[String]] = js.native
}

package typings.maximMazurokGapiClientGames.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyName extends StObject {
  
  /** The family name of this player. In some places, this is known as the last name. */
  var familyName: js.UndefOr[String] = js.undefined
  
  /** The given name of this player. In some places, this is known as the first name. */
  var givenName: js.UndefOr[String] = js.undefined
}
object FamilyName {
  
  @scala.inline
  def apply(): FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyName]
  }
  
  @scala.inline
  implicit class FamilyNameMutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}

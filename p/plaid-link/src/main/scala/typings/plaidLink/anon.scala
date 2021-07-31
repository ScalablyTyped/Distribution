package typings.plaidLink

import typings.plaidLink.mod.Plaid.CreateConfig
import typings.plaidLink.mod.Plaid.LinkHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(params: CreateConfig): LinkHandler
    
    var version: String
  }
  object Create {
    
    @scala.inline
    def apply(create: CreateConfig => LinkHandler, version: String): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateConfig => LinkHandler): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Institutionid extends StObject {
    
    var institution_id: String
    
    var name: String
  }
  object Institutionid {
    
    @scala.inline
    def apply(institution_id: String, name: String): Institutionid = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institutionid]
    }
    
    @scala.inline
    implicit class InstitutionidMutableBuilder[Self <: Institutionid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

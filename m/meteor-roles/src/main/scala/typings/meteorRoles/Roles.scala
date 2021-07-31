package typings.meteorRoles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions related to user authorization. Compatible with built-in Meteor accounts packages.
  *
  * @module Roles
  */
object Roles {
  
  trait Role extends StObject {
    
    var name: String
  }
  object Role {
    
    @scala.inline
    def apply(name: String): Role = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Role]
    }
    
    @scala.inline
    implicit class RoleMutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

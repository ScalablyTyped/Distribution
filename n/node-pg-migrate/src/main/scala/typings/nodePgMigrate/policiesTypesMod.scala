package typings.nodePgMigrate

import typings.nodePgMigrate.anon.ReverseCreatePolicyFn
import typings.nodePgMigrate.anon.ReverseRenamePolicyFn
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.ALL
import typings.nodePgMigrate.nodePgMigrateStrings.DELETE
import typings.nodePgMigrate.nodePgMigrateStrings.INSERT
import typings.nodePgMigrate.nodePgMigrateStrings.SELECT
import typings.nodePgMigrate.nodePgMigrateStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policiesTypesMod {
  
  type AlterPolicy = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ PolicyOptions, 
    String | js.Array[String]
  ]
  
  type CreatePolicy = CreatePolicyFn with ReverseCreatePolicyFn
  
  type CreatePolicyFn = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ js.UndefOr[CreatePolicyOptions with IfExistsOption], 
    String | js.Array[String]
  ]
  
  type CreatePolicyOptions = CreatePolicyOptionsEn with PolicyOptions
  
  @js.native
  trait CreatePolicyOptionsEn extends StObject {
    
    var command: js.UndefOr[ALL | SELECT | INSERT | UPDATE | DELETE] = js.native
  }
  object CreatePolicyOptionsEn {
    
    @scala.inline
    def apply(): CreatePolicyOptionsEn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePolicyOptionsEn]
    }
    
    @scala.inline
    implicit class CreatePolicyOptionsEnMutableBuilder[Self <: CreatePolicyOptionsEn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: ALL | SELECT | INSERT | UPDATE | DELETE): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    }
  }
  
  type DropPolicy = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* options */ js.UndefOr[IfExistsOption], 
    String | js.Array[String]
  ]
  
  @js.native
  trait PolicyOptions extends StObject {
    
    var check: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String | js.Array[String]] = js.native
    
    var using: js.UndefOr[String] = js.native
  }
  object PolicyOptions {
    
    @scala.inline
    def apply(): PolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyOptions]
    }
    
    @scala.inline
    implicit class PolicyOptionsMutableBuilder[Self <: PolicyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setRole(value: String | js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value :_*))
      
      @scala.inline
      def setUsing(value: String): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsingUndefined: Self = StObject.set(x, "using", js.undefined)
    }
  }
  
  type RenamePolicy = RenamePolicyFn with ReverseRenamePolicyFn
  
  type RenamePolicyFn = js.Function3[
    /* tableName */ Name, 
    /* policyName */ String, 
    /* newPolicyName */ String, 
    String | js.Array[String]
  ]
}

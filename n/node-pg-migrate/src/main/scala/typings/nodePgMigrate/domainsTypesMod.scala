package typings.nodePgMigrate

import typings.nodePgMigrate.anon.Reverse
import typings.nodePgMigrate.anon.ReverseRenameDomainFn
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainsTypesMod {
  
  type AlterDomain = js.Function2[
    /* domainName */ Name, 
    /* domainOptions */ DomainOptionsAlter, 
    String | js.Array[String]
  ]
  
  type CreateDomain = CreateDomainFn with Reverse
  
  type CreateDomainFn = js.Function3[
    /* domainName */ Name, 
    /* type */ Type, 
    /* domainOptions */ js.UndefOr[DomainOptionsCreate with DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait DomainOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.native
    
    var check: js.UndefOr[String] = js.native
    
    var constraintName: js.UndefOr[String] = js.native
    
    var notNull: js.UndefOr[Boolean] = js.native
  }
  object DomainOptions {
    
    @scala.inline
    def apply(): DomainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainOptions]
    }
    
    @scala.inline
    implicit class DomainOptionsMutableBuilder[Self <: DomainOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setConstraintName(value: String): Self = StObject.set(x, "constraintName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintNameUndefined: Self = StObject.set(x, "constraintName", js.undefined)
      
      @scala.inline
      def setDefault(value: Value): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    }
  }
  
  @js.native
  trait DomainOptionsAlter extends DomainOptions {
    
    var allowNull: js.UndefOr[Boolean] = js.native
  }
  object DomainOptionsAlter {
    
    @scala.inline
    def apply(): DomainOptionsAlter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainOptionsAlter]
    }
    
    @scala.inline
    implicit class DomainOptionsAlterMutableBuilder[Self <: DomainOptionsAlter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    }
  }
  
  @js.native
  trait DomainOptionsCreate extends DomainOptions {
    
    var collation: js.UndefOr[String] = js.native
  }
  object DomainOptionsCreate {
    
    @scala.inline
    def apply(): DomainOptionsCreate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainOptionsCreate]
    }
    
    @scala.inline
    implicit class DomainOptionsCreateMutableBuilder[Self <: DomainOptionsCreate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    }
  }
  
  type DropDomain = js.Function2[
    /* domainName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type RenameDomain = RenameDomainFn with ReverseRenameDomainFn
  
  type RenameDomainFn = js.Function2[/* oldDomainName */ Name, /* newDomainName */ Name, String | js.Array[String]]
}

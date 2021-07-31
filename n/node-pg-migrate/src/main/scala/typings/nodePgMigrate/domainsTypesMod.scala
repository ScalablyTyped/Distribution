package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainsTypesMod {
  
  type AlterDomain = js.Function2[
    /* domainName */ Name, 
    /* domainOptions */ DomainOptionsAlter, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateDomain extends CreateDomainFn {
    
    def reverse(domainName: Name, `type`: Type): String | js.Array[String] = js.native
    def reverse(domainName: Name, `type`: Type, domainOptions: DomainOptionsCreate & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateDomainFn = js.native
  }
  
  type CreateDomainFn = js.Function3[
    /* domainName */ Name, 
    /* type */ Type, 
    /* domainOptions */ js.UndefOr[DomainOptionsCreate & DropOptions], 
    String | js.Array[String]
  ]
  
  trait DomainOptions extends StObject {
    
    var default: js.UndefOr[Value] = js.undefined
    
    var check: js.UndefOr[String] = js.undefined
    
    var constraintName: js.UndefOr[String] = js.undefined
    
    var notNull: js.UndefOr[Boolean] = js.undefined
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
  
  trait DomainOptionsAlter
    extends StObject
       with DomainOptions {
    
    var allowNull: js.UndefOr[Boolean] = js.undefined
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
  
  trait DomainOptionsCreate
    extends StObject
       with DomainOptions {
    
    var collation: js.UndefOr[String] = js.undefined
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
  
  @js.native
  trait RenameDomain extends RenameDomainFn {
    
    def reverse(oldDomainName: Name, newDomainName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameDomainFn = js.native
  }
  
  type RenameDomainFn = js.Function2[/* oldDomainName */ Name, /* newDomainName */ Name, String | js.Array[String]]
}

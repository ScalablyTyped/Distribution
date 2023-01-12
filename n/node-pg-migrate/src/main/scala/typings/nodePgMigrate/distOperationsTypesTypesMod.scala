package typings.nodePgMigrate

import typings.nodePgMigrate.anon.namestringTypeDropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typings.nodePgMigrate.distOperationsGeneralTypesMod.IfExistsOption
import typings.nodePgMigrate.distOperationsGeneralTypesMod.IfNotExistsOption
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Type
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTypesTypesMod {
  
  @js.native
  trait AddTypeAttribute extends AddTypeAttributeFn {
    
    def reverse(typeName: Name, attributeName: String, attributeType: Type & IfExistsOption): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: AddTypeAttributeFn = js.native
  }
  
  type AddTypeAttributeFn = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* attributeType */ Type & IfExistsOption, 
    String | js.Array[String]
  ]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type AddTypeValue = (typeName : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Name, value : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value, options : node-pg-migrate.node-pg-migrate/dist/operations/typesTypes.AddTypeValueOptions | undefined): string | std.Array<string>
  }}}
  to avoid circular code involving: 
  - node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value
  - node-pg-migrate.node-pg-migrate/dist/operations/typesTypes.AddTypeValue
  */
  @js.native
  trait AddTypeValue extends StObject {
    
    def apply(typeName: Name, value: Value): String | js.Array[String] = js.native
    def apply(typeName: Name, value: Value, options: AddTypeValueOptions): String | js.Array[String] = js.native
  }
  
  trait AddTypeValueOptions
    extends StObject
       with IfNotExistsOption {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
  }
  object AddTypeValueOptions {
    
    inline def apply(): AddTypeValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTypeValueOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddTypeValueOptions] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  @js.native
  trait CreateType
    extends StObject
       with CreateTypeFn {
    
    def reverse(typeName: Name, values: js.Array[Value] & DropOptions): String | js.Array[String] = js.native
    def reverse(typeName: Name, values: namestringTypeDropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateTypeFn = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CreateTypeFn = (typeName : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Name, values : std.Array<node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value> & node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.DropOptions | / * Inlined {[name: string] : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Type} & node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.DropOptions * /
  {[name: string] : node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Type,   ifExists :boolean | undefined,   cascade :boolean | undefined}): string | std.Array<string>
  }}}
  to avoid circular code involving: 
  - node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value
  - node-pg-migrate.node-pg-migrate/dist/operations/typesTypes.CreateTypeFn
  */
  @js.native
  trait CreateTypeFn extends StObject {
    
    def apply(typeName: Name, values: js.Array[Value] & DropOptions): String | js.Array[String] = js.native
    def apply(typeName: Name, values: namestringTypeDropOptions): String | js.Array[String] = js.native
  }
  
  type DropType = js.Function2[
    /* typeName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type DropTypeAttribute = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* options */ IfExistsOption, 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameType extends RenameTypeFn {
    
    def reverse(typeName: Name, newTypeName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameTypeFn = js.native
  }
  
  @js.native
  trait RenameTypeAttribute extends RenameTypeAttributeFn {
    
    def reverse(typeName: Name, attributeName: String, newAttributeName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameTypeAttributeFn = js.native
  }
  
  type RenameTypeAttributeFn = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* newAttributeName */ String, 
    String | js.Array[String]
  ]
  
  type RenameTypeFn = js.Function2[/* typeName */ Name, /* newTypeName */ Name, String | js.Array[String]]
  
  @js.native
  trait RenameTypeValue extends RenameTypeValueFn {
    
    def reverse(typeName: Name, value: String, newValue: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameTypeValueFn = js.native
  }
  
  type RenameTypeValueFn = js.Function3[
    /* typeName */ Name, 
    /* value */ String, 
    /* newValue */ String, 
    String | js.Array[String]
  ]
  
  type SetTypeAttribute = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* attributeType */ Type, 
    String | js.Array[String]
  ]
}

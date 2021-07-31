package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
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
  
  type AddTypeValue = js.Function3[
    /* typeName */ Name, 
    /* value */ Value, 
    /* options */ js.UndefOr[AddTypeValueOptions], 
    String | js.Array[String]
  ]
  
  trait AddTypeValueOptions
    extends StObject
       with IfNotExistsOption {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
  }
  object AddTypeValueOptions {
    
    @scala.inline
    def apply(): AddTypeValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTypeValueOptions]
    }
    
    @scala.inline
    implicit class AddTypeValueOptionsMutableBuilder[Self <: AddTypeValueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  @js.native
  trait CreateType extends CreateTypeFn {
    
    def reverse(typeName: Name, values: (js.Array[Value] | StringDictionary[Type]) & DropOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateTypeFn = js.native
  }
  
  type CreateTypeFn = js.Function2[
    /* typeName */ Name, 
    /* values */ (js.Array[Value] | StringDictionary[Type]) & DropOptions, 
    String | js.Array[String]
  ]
  
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

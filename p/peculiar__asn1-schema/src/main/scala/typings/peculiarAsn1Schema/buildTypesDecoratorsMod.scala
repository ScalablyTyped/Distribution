package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnTypeTypes
import typings.peculiarAsn1Schema.buildTypesTypesMod.IAsnConverter
import typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDecoratorsMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AsnChoiceType(): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnChoiceType")().asInstanceOf[AsnTypeDecorator]
  
  inline def AsnProp(options: IAsn1PropOptions): AsnPropDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnProp")(options.asInstanceOf[js.Any]).asInstanceOf[AsnPropDecorator]
  
  inline def AsnSequenceType(options: IAsn1SequenceOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnSequenceType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  inline def AsnSetType(options: IAsn1SetOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnSetType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  inline def AsnType(options: IAsn1TypeOptions): AsnTypeDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AsnType")(options.asInstanceOf[js.Any]).asInstanceOf[AsnTypeDecorator]
  
  /* Rewritten from type alias, can be one of: 
    - typings.peculiarAsn1Schema.buildTypesEnumsMod.AsnPropTypes
    - typings.peculiarAsn1Schema.buildTypesTypesMod.IEmptyConstructor[T]
  */
  trait AsnItemType[T] extends StObject
  
  type AsnPropDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]
  
  type AsnRepeatType = AsnRepeatTypeString
  
  /* Rewritten from type alias, can be one of: 
    - typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.sequence
    - typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.set
  */
  trait AsnRepeatTypeString extends StObject
  object AsnRepeatTypeString {
    
    inline def sequence: typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.sequence = "sequence".asInstanceOf[typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.sequence]
    
    inline def set: typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.set = "set".asInstanceOf[typings.peculiarAsn1Schema.peculiarAsn1SchemaStrings.set]
  }
  
  type AsnTypeDecorator = js.Function1[/* target */ IEmptyConstructor[Any], Unit]
  
  trait IAsn1PropOptions extends StObject {
    
    var context: js.UndefOr[Double] = js.undefined
    
    var converter: js.UndefOr[IAsnConverter[Any, AsnType]] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var `implicit`: js.UndefOr[Boolean] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var repeated: js.UndefOr[AsnRepeatType] = js.undefined
    
    var `type`: AsnItemType[Any]
  }
  object IAsn1PropOptions {
    
    inline def apply(`type`: AsnItemType[Any]): IAsn1PropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsn1PropOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAsn1PropOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setConverter(value: IAsnConverter[Any, AsnType]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRepeated(value: AsnRepeatType): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      inline def setType(value: AsnItemType[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAsn1SequenceOptions extends StObject {
    
    var itemType: js.UndefOr[AsnItemType[Any]] = js.undefined
  }
  object IAsn1SequenceOptions {
    
    inline def apply(): IAsn1SequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAsn1SequenceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAsn1SequenceOptions] (val x: Self) extends AnyVal {
      
      inline def setItemType(value: AsnItemType[Any]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    }
  }
  
  trait IAsn1SetOptions extends StObject {
    
    var itemType: AsnItemType[Any]
  }
  object IAsn1SetOptions {
    
    inline def apply(itemType: AsnItemType[Any]): IAsn1SetOptions = {
      val __obj = js.Dynamic.literal(itemType = itemType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsn1SetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAsn1SetOptions] (val x: Self) extends AnyVal {
      
      inline def setItemType(value: AsnItemType[Any]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAsn1TypeOptions extends StObject {
    
    var itemType: js.UndefOr[AsnItemType[Any]] = js.undefined
    
    var `type`: AsnTypeTypes
  }
  object IAsn1TypeOptions {
    
    inline def apply(`type`: AsnTypeTypes): IAsn1TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsn1TypeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAsn1TypeOptions] (val x: Self) extends AnyVal {
      
      inline def setItemType(value: AsnItemType[Any]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setType(value: AsnTypeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

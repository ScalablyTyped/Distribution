package typings.mdastUtilMdxJsx

import typings.mdast.mod.BlockContent
import typings.mdast.mod.Literal
import typings.mdast.mod.Parent
import typings.mdast.mod.PhrasingContent
import typings.mdastUtilMdxJsx.anon.Estree
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.mdxJsxAttribute
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.mdxJsxAttributeValueExpression
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.mdxJsxExpressionAttribute
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.mdxJsxFlowElement
import typings.mdastUtilMdxJsx.mdastUtilMdxJsxStrings.mdxJsxTextElement
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComplexTypesMod {
  
  trait MdxJsxAttribute
    extends StObject
       with Node[Data] {
    
    var name: String
    
    @JSName("type")
    var type_MdxJsxAttribute: mdxJsxAttribute
    
    var value: js.UndefOr[MdxJsxAttributeValueExpression | String | Null] = js.undefined
  }
  object MdxJsxAttribute {
    
    inline def apply(name: String): MdxJsxAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxJsxAttribute")
      __obj.asInstanceOf[MdxJsxAttribute]
    }
    
    extension [Self <: MdxJsxAttribute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: mdxJsxAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: MdxJsxAttributeValueExpression | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MdxJsxAttributeValueExpression
    extends StObject
       with Literal {
    
    @JSName("data")
    var data_MdxJsxAttributeValueExpression: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    @JSName("type")
    var type_MdxJsxAttributeValueExpression: mdxJsxAttributeValueExpression
  }
  object MdxJsxAttributeValueExpression {
    
    inline def apply(value: Any): MdxJsxAttributeValueExpression = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxJsxAttributeValueExpression")
      __obj.asInstanceOf[MdxJsxAttributeValueExpression]
    }
    
    extension [Self <: MdxJsxAttributeValueExpression](x: Self) {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxJsxAttributeValueExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxJsxElementFields extends StObject {
    
    var attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute]
    
    var name: String | Null
  }
  object MdxJsxElementFields {
    
    inline def apply(attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute]): MdxJsxElementFields = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[MdxJsxElementFields]
    }
    
    extension [Self <: MdxJsxElementFields](x: Self) {
      
      inline def setAttributes(value: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: (MdxJsxAttribute | MdxJsxExpressionAttribute)*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
  
  trait MdxJsxExpressionAttribute
    extends StObject
       with Literal {
    
    @JSName("data")
    var data_MdxJsxExpressionAttribute: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    @JSName("type")
    var type_MdxJsxExpressionAttribute: mdxJsxExpressionAttribute
  }
  object MdxJsxExpressionAttribute {
    
    inline def apply(value: Any): MdxJsxExpressionAttribute = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxJsxExpressionAttribute")
      __obj.asInstanceOf[MdxJsxExpressionAttribute]
    }
    
    extension [Self <: MdxJsxExpressionAttribute](x: Self) {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxJsxExpressionAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxJsxFlowElement
    extends StObject
       with MdxJsxElementFields
       with Parent {
    
    @JSName("children")
    var children_MdxJsxFlowElement: js.Array[BlockContent]
    
    @JSName("type")
    var type_MdxJsxFlowElement: mdxJsxFlowElement
  }
  object MdxJsxFlowElement {
    
    inline def apply(
      attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute],
      children: js.Array[BlockContent]
    ): MdxJsxFlowElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")("mdxJsxFlowElement")
      __obj.asInstanceOf[MdxJsxFlowElement]
    }
    
    extension [Self <: MdxJsxFlowElement](x: Self) {
      
      inline def setChildren(value: js.Array[BlockContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: BlockContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: mdxJsxFlowElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxJsxTextElement
    extends StObject
       with MdxJsxElementFields
       with Parent {
    
    @JSName("children")
    var children_MdxJsxTextElement: js.Array[PhrasingContent]
    
    @JSName("type")
    var type_MdxJsxTextElement: mdxJsxTextElement
  }
  object MdxJsxTextElement {
    
    inline def apply(
      attributes: js.Array[MdxJsxAttribute | MdxJsxExpressionAttribute],
      children: js.Array[PhrasingContent]
    ): MdxJsxTextElement = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")("mdxJsxTextElement")
      __obj.asInstanceOf[MdxJsxTextElement]
    }
    
    extension [Self <: MdxJsxTextElement](x: Self) {
      
      inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: mdxJsxTextElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object hastAugmentingMod {
    
    trait ElementContentMap extends StObject {
      
      var mdxJsxFlowElement: MdxJsxFlowElement
      
      var mdxJsxTextElement: MdxJsxTextElement
    }
    object ElementContentMap {
      
      inline def apply(mdxJsxFlowElement: MdxJsxFlowElement, mdxJsxTextElement: MdxJsxTextElement): ElementContentMap = {
        val __obj = js.Dynamic.literal(mdxJsxFlowElement = mdxJsxFlowElement.asInstanceOf[js.Any], mdxJsxTextElement = mdxJsxTextElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementContentMap]
      }
      
      extension [Self <: ElementContentMap](x: Self) {
        
        inline def setMdxJsxFlowElement(value: MdxJsxFlowElement): Self = StObject.set(x, "mdxJsxFlowElement", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextElement(value: MdxJsxTextElement): Self = StObject.set(x, "mdxJsxTextElement", value.asInstanceOf[js.Any])
      }
    }
    
    trait RootContentMap extends StObject {
      
      var mdxJsxFlowElement: MdxJsxFlowElement
      
      var mdxJsxTextElement: MdxJsxTextElement
    }
    object RootContentMap {
      
      inline def apply(mdxJsxFlowElement: MdxJsxFlowElement, mdxJsxTextElement: MdxJsxTextElement): RootContentMap = {
        val __obj = js.Dynamic.literal(mdxJsxFlowElement = mdxJsxFlowElement.asInstanceOf[js.Any], mdxJsxTextElement = mdxJsxTextElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootContentMap]
      }
      
      extension [Self <: RootContentMap](x: Self) {
        
        inline def setMdxJsxFlowElement(value: MdxJsxFlowElement): Self = StObject.set(x, "mdxJsxFlowElement", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextElement(value: MdxJsxTextElement): Self = StObject.set(x, "mdxJsxTextElement", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object mdastAugmentingMod {
    
    trait BlockContentMap extends StObject {
      
      var mdxJsxFlowElement: MdxJsxFlowElement
    }
    object BlockContentMap {
      
      inline def apply(mdxJsxFlowElement: MdxJsxFlowElement): BlockContentMap = {
        val __obj = js.Dynamic.literal(mdxJsxFlowElement = mdxJsxFlowElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[BlockContentMap]
      }
      
      extension [Self <: BlockContentMap](x: Self) {
        
        inline def setMdxJsxFlowElement(value: MdxJsxFlowElement): Self = StObject.set(x, "mdxJsxFlowElement", value.asInstanceOf[js.Any])
      }
    }
    
    trait StaticPhrasingContentMap extends StObject {
      
      var mdxJsxTextElement: MdxJsxTextElement
    }
    object StaticPhrasingContentMap {
      
      inline def apply(mdxJsxTextElement: MdxJsxTextElement): StaticPhrasingContentMap = {
        val __obj = js.Dynamic.literal(mdxJsxTextElement = mdxJsxTextElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[StaticPhrasingContentMap]
      }
      
      extension [Self <: StaticPhrasingContentMap](x: Self) {
        
        inline def setMdxJsxTextElement(value: MdxJsxTextElement): Self = StObject.set(x, "mdxJsxTextElement", value.asInstanceOf[js.Any])
      }
    }
  }
}

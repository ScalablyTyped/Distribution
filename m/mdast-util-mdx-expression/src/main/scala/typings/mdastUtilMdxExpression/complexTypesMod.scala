package typings.mdastUtilMdxExpression

import typings.mdast.mod.Literal
import typings.mdastUtilMdxExpression.anon.Estree
import typings.mdastUtilMdxExpression.mdastUtilMdxExpressionStrings.mdxFlowExpression
import typings.mdastUtilMdxExpression.mdastUtilMdxExpressionStrings.mdxTextExpression
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexTypesMod {
  
  trait MdxFlowExpression
    extends StObject
       with Literal {
    
    @JSName("data")
    var data_MdxFlowExpression: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    @JSName("type")
    var type_MdxFlowExpression: mdxFlowExpression
  }
  object MdxFlowExpression {
    
    inline def apply(value: Any): MdxFlowExpression = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxFlowExpression")
      __obj.asInstanceOf[MdxFlowExpression]
    }
    
    extension [Self <: MdxFlowExpression](x: Self) {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxFlowExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxTextExpression
    extends StObject
       with Literal {
    
    @JSName("data")
    var data_MdxTextExpression: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    @JSName("type")
    var type_MdxTextExpression: mdxTextExpression
  }
  object MdxTextExpression {
    
    inline def apply(value: Any): MdxTextExpression = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxTextExpression")
      __obj.asInstanceOf[MdxTextExpression]
    }
    
    extension [Self <: MdxTextExpression](x: Self) {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxTextExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  object hastAugmentingMod {
    
    trait ElementContentMap extends StObject {
      
      var mdxFlowExpression: MdxFlowExpression
      
      var mdxTextExpression: MdxTextExpression
    }
    object ElementContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpression, mdxTextExpression: MdxTextExpression): ElementContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any], mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementContentMap]
      }
      
      extension [Self <: ElementContentMap](x: Self) {
        
        inline def setMdxFlowExpression(value: MdxFlowExpression): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpression(value: MdxTextExpression): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
    
    trait RootContentMap extends StObject {
      
      var mdxFlowExpression: MdxFlowExpression
      
      var mdxTextExpression: MdxTextExpression
    }
    object RootContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpression, mdxTextExpression: MdxTextExpression): RootContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any], mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootContentMap]
      }
      
      extension [Self <: RootContentMap](x: Self) {
        
        inline def setMdxFlowExpression(value: MdxFlowExpression): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpression(value: MdxTextExpression): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object mdastAugmentingMod {
    
    trait BlockContentMap extends StObject {
      
      var mdxFlowExpression: MdxFlowExpression
    }
    object BlockContentMap {
      
      inline def apply(mdxFlowExpression: MdxFlowExpression): BlockContentMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = mdxFlowExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[BlockContentMap]
      }
      
      extension [Self <: BlockContentMap](x: Self) {
        
        inline def setMdxFlowExpression(value: MdxFlowExpression): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
      }
    }
    
    trait StaticPhrasingContentMap extends StObject {
      
      var mdxTextExpression: MdxTextExpression
    }
    object StaticPhrasingContentMap {
      
      inline def apply(mdxTextExpression: MdxTextExpression): StaticPhrasingContentMap = {
        val __obj = js.Dynamic.literal(mdxTextExpression = mdxTextExpression.asInstanceOf[js.Any])
        __obj.asInstanceOf[StaticPhrasingContentMap]
      }
      
      extension [Self <: StaticPhrasingContentMap](x: Self) {
        
        inline def setMdxTextExpression(value: MdxTextExpression): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
      }
    }
  }
}

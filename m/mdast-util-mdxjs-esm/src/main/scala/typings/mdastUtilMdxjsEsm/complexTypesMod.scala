package typings.mdastUtilMdxjsEsm

import typings.mdast.mod.Literal
import typings.mdastUtilMdxjsEsm.anon.Estree
import typings.mdastUtilMdxjsEsm.mdastUtilMdxjsEsmStrings.mdxjsEsm
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexTypesMod {
  
  trait MdxjsEsm
    extends StObject
       with Literal {
    
    @JSName("data")
    var data_MdxjsEsm: js.UndefOr[Estree & js.UndefOr[Data]] = js.undefined
    
    @JSName("type")
    var type_MdxjsEsm: mdxjsEsm
  }
  object MdxjsEsm {
    
    inline def apply(value: Any): MdxjsEsm = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mdxjsEsm")
      __obj.asInstanceOf[MdxjsEsm]
    }
    
    extension [Self <: MdxjsEsm](x: Self) {
      
      inline def setData(value: Estree & js.UndefOr[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: mdxjsEsm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  object hastAugmentingMod {
    
    trait ElementContentMap extends StObject {
      
      var mdxjsEsm: MdxjsEsm
    }
    object ElementContentMap {
      
      inline def apply(mdxjsEsm: MdxjsEsm): ElementContentMap = {
        val __obj = js.Dynamic.literal(mdxjsEsm = mdxjsEsm.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementContentMap]
      }
      
      extension [Self <: ElementContentMap](x: Self) {
        
        inline def setMdxjsEsm(value: MdxjsEsm): Self = StObject.set(x, "mdxjsEsm", value.asInstanceOf[js.Any])
      }
    }
    
    trait RootContentMap extends StObject {
      
      var mdxjsEsm: MdxjsEsm
    }
    object RootContentMap {
      
      inline def apply(mdxjsEsm: MdxjsEsm): RootContentMap = {
        val __obj = js.Dynamic.literal(mdxjsEsm = mdxjsEsm.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootContentMap]
      }
      
      extension [Self <: RootContentMap](x: Self) {
        
        inline def setMdxjsEsm(value: MdxjsEsm): Self = StObject.set(x, "mdxjsEsm", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object mdastAugmentingMod {
    
    trait BlockContentMap extends StObject {
      
      var mdxjsEsm: MdxjsEsm
    }
    object BlockContentMap {
      
      inline def apply(mdxjsEsm: MdxjsEsm): BlockContentMap = {
        val __obj = js.Dynamic.literal(mdxjsEsm = mdxjsEsm.asInstanceOf[js.Any])
        __obj.asInstanceOf[BlockContentMap]
      }
      
      extension [Self <: BlockContentMap](x: Self) {
        
        inline def setMdxjsEsm(value: MdxjsEsm): Self = StObject.set(x, "mdxjsEsm", value.asInstanceOf[js.Any])
      }
    }
  }
}

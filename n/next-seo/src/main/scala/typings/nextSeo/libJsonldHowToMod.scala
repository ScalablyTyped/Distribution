package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldHowToMod {
  
  @JSImport("next-seo/lib/jsonld/howTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: HowToJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HowToJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var estimatedCost: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriceSpecification */ Any
      ] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var step: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any
      ]
    
    var supply: js.UndefOr[js.Array[String]] = js.undefined
    
    var tool: js.UndefOr[js.Array[String]] = js.undefined
    
    var totalTime: js.UndefOr[String] = js.undefined
  }
  object HowToJsonLdProps {
    
    inline def apply(
      name: String,
      step: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any
        ]
    ): HowToJsonLdProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[HowToJsonLdProps]
    }
    
    extension [Self <: HowToJsonLdProps](x: Self) {
      
      inline def setEstimatedCost(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriceSpecification */ Any
      ): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
      
      inline def setEstimatedCostUndefined: Self = StObject.set(x, "estimatedCost", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStep(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any
            ]
      ): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any)*
      ): Self = StObject.set(x, "step", js.Array(value*))
      
      inline def setSupply(value: js.Array[String]): Self = StObject.set(x, "supply", value.asInstanceOf[js.Any])
      
      inline def setSupplyUndefined: Self = StObject.set(x, "supply", js.undefined)
      
      inline def setSupplyVarargs(value: String*): Self = StObject.set(x, "supply", js.Array(value*))
      
      inline def setTool(value: js.Array[String]): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      inline def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
      
      inline def setToolVarargs(value: String*): Self = StObject.set(x, "tool", js.Array(value*))
      
      inline def setTotalTime(value: String): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
      
      inline def setTotalTimeUndefined: Self = StObject.set(x, "totalTime", js.undefined)
    }
  }
}

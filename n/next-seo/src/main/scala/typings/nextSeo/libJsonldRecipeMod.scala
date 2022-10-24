package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldRecipeMod {
  
  @JSImport("next-seo/lib/jsonld/recipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: RecipeJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RecipeJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var authorName: String | js.Array[String]
    
    var calories: js.UndefOr[Double] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var cookTime: js.UndefOr[String] = js.undefined
    
    var cuisine: js.UndefOr[String] = js.undefined
    
    var datePublished: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var ingredients: js.Array[String]
    
    var instructions: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instruction */ Any
      ]
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var prepTime: js.UndefOr[String] = js.undefined
    
    var totalTime: js.UndefOr[String] = js.undefined
    
    var video: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
      ] = js.undefined
    
    var yields: js.UndefOr[String] = js.undefined
  }
  object RecipeJsonLdProps {
    
    inline def apply(
      authorName: String | js.Array[String],
      description: String,
      ingredients: js.Array[String],
      instructions: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instruction */ Any
        ],
      name: String
    ): RecipeJsonLdProps = {
      val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ingredients = ingredients.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipeJsonLdProps]
    }
    
    extension [Self <: RecipeJsonLdProps](x: Self) {
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setAuthorName(value: String | js.Array[String]): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorNameVarargs(value: String*): Self = StObject.set(x, "authorName", js.Array(value*))
      
      inline def setCalories(value: Double): Self = StObject.set(x, "calories", value.asInstanceOf[js.Any])
      
      inline def setCaloriesUndefined: Self = StObject.set(x, "calories", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCookTime(value: String): Self = StObject.set(x, "cookTime", value.asInstanceOf[js.Any])
      
      inline def setCookTimeUndefined: Self = StObject.set(x, "cookTime", js.undefined)
      
      inline def setCuisine(value: String): Self = StObject.set(x, "cuisine", value.asInstanceOf[js.Any])
      
      inline def setCuisineUndefined: Self = StObject.set(x, "cuisine", js.undefined)
      
      inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
      
      inline def setDatePublishedUndefined: Self = StObject.set(x, "datePublished", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setIngredients(value: js.Array[String]): Self = StObject.set(x, "ingredients", value.asInstanceOf[js.Any])
      
      inline def setIngredientsVarargs(value: String*): Self = StObject.set(x, "ingredients", js.Array(value*))
      
      inline def setInstructions(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instruction */ Any
            ]
      ): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      inline def setInstructionsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instruction */ Any)*
      ): Self = StObject.set(x, "instructions", js.Array(value*))
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrepTime(value: String): Self = StObject.set(x, "prepTime", value.asInstanceOf[js.Any])
      
      inline def setPrepTimeUndefined: Self = StObject.set(x, "prepTime", js.undefined)
      
      inline def setTotalTime(value: String): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
      
      inline def setTotalTimeUndefined: Self = StObject.set(x, "totalTime", js.undefined)
      
      inline def setVideo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
      ): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setYields(value: String): Self = StObject.set(x, "yields", value.asInstanceOf[js.Any])
      
      inline def setYieldsUndefined: Self = StObject.set(x, "yields", js.undefined)
    }
  }
}

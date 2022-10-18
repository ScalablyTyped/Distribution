package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.nextSeo.nextSeoStrings.course
import typings.nextSeo.nextSeoStrings.default
import typings.nextSeo.nextSeoStrings.movie
import typings.nextSeo.nextSeoStrings.recipe
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldCarouselMod {
  
  @JSImport("next-seo/lib/jsonld/carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideOfTypeData: CarouselJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideOfTypeData.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CarouselJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var data: Any | (js.Array[
        DefaultDataProps | ExtendedCourseJsonLdProps | ExtendedRecipeJsonLdProps | MovieJsonLdProps
      ])
    
    var ofType: default | movie | recipe | course
  }
  object CarouselJsonLdProps {
    
    inline def apply(
      data: Any | (js.Array[
          DefaultDataProps | ExtendedCourseJsonLdProps | ExtendedRecipeJsonLdProps | MovieJsonLdProps
        ]),
      ofType: default | movie | recipe | course
    ): CarouselJsonLdProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselJsonLdProps]
    }
    
    extension [Self <: CarouselJsonLdProps](x: Self) {
      
      inline def setData(
        value: Any | (js.Array[
              DefaultDataProps | ExtendedCourseJsonLdProps | ExtendedRecipeJsonLdProps | MovieJsonLdProps
            ])
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(
        value: (DefaultDataProps | ExtendedCourseJsonLdProps | ExtendedRecipeJsonLdProps | MovieJsonLdProps)*
      ): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOfType(value: default | movie | recipe | course): Self = StObject.set(x, "ofType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultDataProps extends StObject {
    
    var url: String
  }
  object DefaultDataProps {
    
    inline def apply(url: String): DefaultDataProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultDataProps]
    }
    
    extension [Self <: DefaultDataProps](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Director extends StObject {
    
    var name: String
  }
  object Director {
    
    inline def apply(name: String): Director = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Director]
    }
    
    extension [Self <: Director](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CourseJsonLdProps * / any */ trait ExtendedCourseJsonLdProps
    extends StObject
       with DefaultDataProps
  object ExtendedCourseJsonLdProps {
    
    inline def apply(url: String): ExtendedCourseJsonLdProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedCourseJsonLdProps]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecipeJsonLdProps * / any */ trait ExtendedRecipeJsonLdProps
    extends StObject
       with DefaultDataProps
  object ExtendedRecipeJsonLdProps {
    
    inline def apply(url: String): ExtendedRecipeJsonLdProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedRecipeJsonLdProps]
    }
  }
  
  trait MovieJsonLdProps extends StObject {
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var dateCreated: js.UndefOr[String] = js.undefined
    
    var director: js.UndefOr[Director | js.Array[Director]] = js.undefined
    
    var image: String
    
    var name: String
    
    var review: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
      ] = js.undefined
    
    var url: String
  }
  object MovieJsonLdProps {
    
    inline def apply(image: String, name: String, url: String): MovieJsonLdProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovieJsonLdProps]
    }
    
    extension [Self <: MovieJsonLdProps](x: Self) {
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setDateCreated(value: String): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDirector(value: Director | js.Array[Director]): Self = StObject.set(x, "director", value.asInstanceOf[js.Any])
      
      inline def setDirectorUndefined: Self = StObject.set(x, "director", js.undefined)
      
      inline def setDirectorVarargs(value: Director*): Self = StObject.set(x, "director", js.Array(value*))
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReview(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
      ): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      inline def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

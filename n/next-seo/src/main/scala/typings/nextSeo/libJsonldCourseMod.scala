package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldCourseMod {
  
  @JSImport("next-seo/lib/jsonld/course", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideCourseNameProviderRest: CourseJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideCourseNameProviderRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CourseJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var courseName: String
    
    var description: String
    
    var provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider */ Any
  }
  object CourseJsonLdProps {
    
    inline def apply(
      courseName: String,
      description: String,
      provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider */ Any
    ): CourseJsonLdProps = {
      val __obj = js.Dynamic.literal(courseName = courseName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[CourseJsonLdProps]
    }
    
    extension [Self <: CourseJsonLdProps](x: Self) {
      
      inline def setCourseName(value: String): Self = StObject.set(x, "courseName", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setProvider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider */ Any
      ): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}

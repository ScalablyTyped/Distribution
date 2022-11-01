package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldOrganizationMod {
  
  @JSImport("next-seo/lib/jsonld/organization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: OrganizationJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait OrganizationJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var address: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
        ])
      ] = js.undefined
    
    var contactPoint: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
        ]
      ] = js.undefined
    
    /**
      * @deprecated please use contactPoint instead. contactPoints will continue to work until next major release.
      */
    var contactPoints: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
        ]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var legalName: js.UndefOr[String] = js.undefined
    
    var logo: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var sameAs: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("type")
    var type_OrganizationJsonLdProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationCategory */ Any
      ] = js.undefined
    
    var url: String
  }
  object OrganizationJsonLdProps {
    
    inline def apply(name: String, url: String): OrganizationJsonLdProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationJsonLdProps]
    }
    
    extension [Self <: OrganizationJsonLdProps](x: Self) {
      
      inline def setAddress(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
            ])
      ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAddressVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any)*
      ): Self = StObject.set(x, "address", js.Array(value*))
      
      inline def setContactPoint(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
            ]
      ): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
      
      inline def setContactPointUndefined: Self = StObject.set(x, "contactPoint", js.undefined)
      
      inline def setContactPointVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any)*
      ): Self = StObject.set(x, "contactPoint", js.Array(value*))
      
      inline def setContactPoints(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
            ]
      ): Self = StObject.set(x, "contactPoints", value.asInstanceOf[js.Any])
      
      inline def setContactPointsUndefined: Self = StObject.set(x, "contactPoints", js.undefined)
      
      inline def setContactPointsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any)*
      ): Self = StObject.set(x, "contactPoints", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
      
      inline def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSameAs(value: js.Array[String]): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
      
      inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
      
      inline def setSameAsVarargs(value: String*): Self = StObject.set(x, "sameAs", js.Array(value*))
      
      inline def setType(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationCategory */ Any
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

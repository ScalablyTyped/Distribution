package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LearningProvider
  extends StObject
     with Entity {
  
  // The display name that appears in Viva Learning. Required.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Learning catalog items for the provider.
  var learningContents: js.UndefOr[NullableOption[js.Array[LearningContent]]] = js.undefined
  
  // Authentication URL to access the courses for the provider. Optional.
  var loginWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The long logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the blob
    * storage of Viva Learning for rendering within the Viva Learning app. Required.
    */
  var longLogoWebUrlForDarkTheme: js.UndefOr[String] = js.undefined
  
  /**
    * The long logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the
    * blob storage of Viva Learning for rendering within the Viva Learning app. Required.
    */
  var longLogoWebUrlForLightTheme: js.UndefOr[String] = js.undefined
  
  /**
    * The square logo URL for the dark mode that needs to be a publicly accessible image. This image would be saved to the
    * blob storage of Viva Learning for rendering within the Viva Learning app. Required.
    */
  var squareLogoWebUrlForDarkTheme: js.UndefOr[String] = js.undefined
  
  /**
    * The square logo URL for the light mode that needs to be a publicly accessible image. This image would be saved to the
    * blob storage of Viva Learning for rendering within the Viva Learning app. Required.
    */
  var squareLogoWebUrlForLightTheme: js.UndefOr[String] = js.undefined
}
object LearningProvider {
  
  inline def apply(): LearningProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LearningProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LearningProvider] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLearningContents(value: NullableOption[js.Array[LearningContent]]): Self = StObject.set(x, "learningContents", value.asInstanceOf[js.Any])
    
    inline def setLearningContentsNull: Self = StObject.set(x, "learningContents", null)
    
    inline def setLearningContentsUndefined: Self = StObject.set(x, "learningContents", js.undefined)
    
    inline def setLearningContentsVarargs(value: LearningContent*): Self = StObject.set(x, "learningContents", js.Array(value*))
    
    inline def setLoginWebUrl(value: NullableOption[String]): Self = StObject.set(x, "loginWebUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginWebUrlNull: Self = StObject.set(x, "loginWebUrl", null)
    
    inline def setLoginWebUrlUndefined: Self = StObject.set(x, "loginWebUrl", js.undefined)
    
    inline def setLongLogoWebUrlForDarkTheme(value: String): Self = StObject.set(x, "longLogoWebUrlForDarkTheme", value.asInstanceOf[js.Any])
    
    inline def setLongLogoWebUrlForDarkThemeUndefined: Self = StObject.set(x, "longLogoWebUrlForDarkTheme", js.undefined)
    
    inline def setLongLogoWebUrlForLightTheme(value: String): Self = StObject.set(x, "longLogoWebUrlForLightTheme", value.asInstanceOf[js.Any])
    
    inline def setLongLogoWebUrlForLightThemeUndefined: Self = StObject.set(x, "longLogoWebUrlForLightTheme", js.undefined)
    
    inline def setSquareLogoWebUrlForDarkTheme(value: String): Self = StObject.set(x, "squareLogoWebUrlForDarkTheme", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoWebUrlForDarkThemeUndefined: Self = StObject.set(x, "squareLogoWebUrlForDarkTheme", js.undefined)
    
    inline def setSquareLogoWebUrlForLightTheme(value: String): Self = StObject.set(x, "squareLogoWebUrlForLightTheme", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoWebUrlForLightThemeUndefined: Self = StObject.set(x, "squareLogoWebUrlForLightTheme", js.undefined)
  }
}

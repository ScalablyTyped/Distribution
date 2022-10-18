package typings.mobx

import typings.mobx.distApiAnnotationMod.Annotation
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOverrideannotationMod {
  
  @JSImport("mobx/dist/types/overrideannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isOverride(annotation: Annotation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOverride")(annotation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("mobx/dist/types/overrideannotation", "override")
  @js.native
  val `override`: Annotation & PropertyDecorator = js.native
}

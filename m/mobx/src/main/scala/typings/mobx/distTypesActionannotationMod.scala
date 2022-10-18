package typings.mobx

import typings.mobx.anon.Configurable
import typings.mobx.distApiAnnotationMod.Annotation
import typings.mobx.distInternalMod.ObservableObjectAdministration
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesActionannotationMod {
  
  @JSImport("mobx/dist/types/actionannotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createActionAnnotation(name: String): Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionAnnotation")(name.asInstanceOf[js.Any]).asInstanceOf[Annotation]
  inline def createActionAnnotation(name: String, options: js.Object): Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("createActionAnnotation")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Annotation]
  
  inline def createActionDescriptor(
    adm: ObservableObjectAdministration,
    annotation: Annotation,
    key: PropertyKey,
    descriptor: js.PropertyDescriptor
  ): Configurable = (^.asInstanceOf[js.Dynamic].applyDynamic("createActionDescriptor")(adm.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Configurable]
  inline def createActionDescriptor(
    adm: ObservableObjectAdministration,
    annotation: Annotation,
    key: PropertyKey,
    descriptor: js.PropertyDescriptor,
    safeDescriptors: Boolean
  ): Configurable = (^.asInstanceOf[js.Dynamic].applyDynamic("createActionDescriptor")(adm.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], safeDescriptors.asInstanceOf[js.Any])).asInstanceOf[Configurable]
}

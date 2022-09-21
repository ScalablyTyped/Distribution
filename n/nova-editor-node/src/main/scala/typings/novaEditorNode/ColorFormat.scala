package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorFormat extends StObject
/// https://docs.nova.app/api-reference/color/
@JSGlobal("ColorFormat")
@js.native
object ColorFormat extends StObject {
  
  @js.native
  sealed trait displayP3
    extends StObject
       with ColorFormat
  
  @js.native
  sealed trait hsb
    extends StObject
       with ColorFormat
  
  @js.native
  sealed trait hsl
    extends StObject
       with ColorFormat
  
  @js.native
  sealed trait rgb
    extends StObject
       with ColorFormat
}

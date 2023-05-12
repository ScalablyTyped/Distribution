package typings.photoshop.domConstantsMod

import typings.photoshop.domTypesCalculationsTypesMod.CalculationsChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationsChannel extends StObject
@JSImport("photoshop/dom/Constants", "CalculationsChannel")
@js.native
object CalculationsChannel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationsChannel & String] = js.native
  
  @js.native
  sealed trait GRAY
    extends StObject
       with CalculationsChannel
       with CalculationsChannelType
  /* "gray" */ val GRAY: typings.photoshop.domConstantsMod.CalculationsChannel.GRAY & String = js.native
  
  @js.native
  sealed trait SELECTION
    extends StObject
       with CalculationsChannel
       with CalculationsChannelType
  /* "selection" */ val SELECTION: typings.photoshop.domConstantsMod.CalculationsChannel.SELECTION & String = js.native
  
  @js.native
  sealed trait TRANSPARENCY
    extends StObject
       with CalculationsChannel
       with CalculationsChannelType
  /* "transparencyEnum" */ val TRANSPARENCY: typings.photoshop.domConstantsMod.CalculationsChannel.TRANSPARENCY & String = js.native
}

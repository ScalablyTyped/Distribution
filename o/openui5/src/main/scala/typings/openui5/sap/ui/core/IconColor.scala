package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconColor extends StObject
/**
  * Semantic Colors of an icon.
  */
@JSGlobal("sap.ui.core.IconColor")
@js.native
object IconColor extends StObject {
  
  @js.native
  sealed trait Critical
    extends StObject
       with IconColor
  
  @js.native
  sealed trait Default
    extends StObject
       with IconColor
  
  @js.native
  sealed trait Negative
    extends StObject
       with IconColor
  
  @js.native
  sealed trait Neutral
    extends StObject
       with IconColor
  
  @js.native
  sealed trait Positive
    extends StObject
       with IconColor
}

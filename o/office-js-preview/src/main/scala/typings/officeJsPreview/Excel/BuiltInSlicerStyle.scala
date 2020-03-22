package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltInSlicerStyle extends js.Object

/**
  *
  * Represents a built-in slicer style.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.BuiltInSlicerStyle")
@js.native
object BuiltInSlicerStyle extends js.Object {
  /**
    * "Accent 1" (blue in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark1 extends BuiltInSlicerStyle
  
  /**
    * "Accent 2" (orange in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark2 extends BuiltInSlicerStyle
  
  /**
    * "Accent 3" (gray in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark3 extends BuiltInSlicerStyle
  
  /**
    * "Accent 4" (yellow in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark4 extends BuiltInSlicerStyle
  
  /**
    * "Accent 5" (light blue in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark5 extends BuiltInSlicerStyle
  
  /**
    * "Accent 6" (green in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark6 extends BuiltInSlicerStyle
  
  /**
    * "Accent 1" (blue in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light1 extends BuiltInSlicerStyle
  
  /**
    * "Accent 2" (orange in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light2 extends BuiltInSlicerStyle
  
  /**
    * "Accent 3" (gray in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light3 extends BuiltInSlicerStyle
  
  /**
    * "Accent 4" (yellow in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light4 extends BuiltInSlicerStyle
  
  /**
    * "Accent 5" (light blue in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light5 extends BuiltInSlicerStyle
  
  /**
    * "Accent 6" (green in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light6 extends BuiltInSlicerStyle
  
  /**
    * Dark gray with light shading.
    *
    */
  @js.native
  sealed trait other1 extends BuiltInSlicerStyle
  
  /**
    * Medium blue with light shading.
    *
    */
  @js.native
  sealed trait other2 extends BuiltInSlicerStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BuiltInSlicerStyle with String] = js.native
  /* "Dark1" */ @js.native
  object dark1 extends TopLevel[dark1 with String]
  
  /* "Dark2" */ @js.native
  object dark2 extends TopLevel[dark2 with String]
  
  /* "Dark3" */ @js.native
  object dark3 extends TopLevel[dark3 with String]
  
  /* "Dark4" */ @js.native
  object dark4 extends TopLevel[dark4 with String]
  
  /* "Dark5" */ @js.native
  object dark5 extends TopLevel[dark5 with String]
  
  /* "Dark6" */ @js.native
  object dark6 extends TopLevel[dark6 with String]
  
  /* "Light1" */ @js.native
  object light1 extends TopLevel[light1 with String]
  
  /* "Light2" */ @js.native
  object light2 extends TopLevel[light2 with String]
  
  /* "Light3" */ @js.native
  object light3 extends TopLevel[light3 with String]
  
  /* "Light4" */ @js.native
  object light4 extends TopLevel[light4 with String]
  
  /* "Light5" */ @js.native
  object light5 extends TopLevel[light5 with String]
  
  /* "Light6" */ @js.native
  object light6 extends TopLevel[light6 with String]
  
  /* "Other1" */ @js.native
  object other1 extends TopLevel[other1 with String]
  
  /* "Other2" */ @js.native
  object other2 extends TopLevel[other2 with String]
  
}


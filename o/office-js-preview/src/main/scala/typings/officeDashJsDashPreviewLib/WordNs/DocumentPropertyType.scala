package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentPropertyType extends js.Object

/**
     * [Api set: WordApi]
     */
@JSGlobal("Word.DocumentPropertyType")
@js.native
object DocumentPropertyType extends js.Object {
  @js.native
  sealed trait boolean
    extends officeDashJsDashPreviewLib.WordNs.DocumentPropertyType
  
  @js.native
  sealed trait date
    extends officeDashJsDashPreviewLib.WordNs.DocumentPropertyType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.WordNs.DocumentPropertyType
  
  @js.native
  sealed trait string
    extends officeDashJsDashPreviewLib.WordNs.DocumentPropertyType
  
  /* "Boolean" */ val boolean: boolean with java.lang.String = js.native
  /* "Date" */ val date: date with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "String" */ val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.DocumentPropertyType with java.lang.String] = js.native
}


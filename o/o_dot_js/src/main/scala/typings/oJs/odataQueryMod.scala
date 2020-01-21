package typings.oJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js/dist/types/OdataQuery", JSImport.Namespace)
@js.native
object odataQueryMod extends js.Object {
  @js.native
  trait OdataQuery
    extends /* key */ StringDictionary[js.Any] {
    @JSName("$compute")
    var $compute: js.UndefOr[String] = js.native
    @JSName("$count")
    var $count: js.UndefOr[Boolean] = js.native
    @JSName("$expand")
    var $expand: js.UndefOr[String] = js.native
    @JSName("$filter")
    var $filter: js.UndefOr[String] = js.native
    @JSName("$format")
    var $format: js.UndefOr[String] = js.native
    @JSName("$index")
    var $index: js.UndefOr[Double] = js.native
    @JSName("$orderby")
    var $orderby: js.UndefOr[String] = js.native
    @JSName("$search")
    var $search: js.UndefOr[String] = js.native
    @JSName("$select")
    var $select: js.UndefOr[String] = js.native
    @JSName("$skip")
    var $skip: js.UndefOr[Double] = js.native
    @JSName("$top")
    var $top: js.UndefOr[Double] = js.native
  }
  
}


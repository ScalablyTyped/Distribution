package typings
package microrouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var query: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Anon_Key {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Key]
  }
}


package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to configure the properties of a Search Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
trait SearchIndex extends js.Object {
  /** Name of the index. */
  var name: java.lang.String
}

object SearchIndex {
  @scala.inline
  def apply(name: java.lang.String): SearchIndex = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[SearchIndex]
  }
}


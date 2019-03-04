package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexCreationQuery extends Executable {
  def fulltext(): IndexCreationQuery
  def on(columns: ((Column[_, _]) | OrderByValueNode)*): IndexCreationQuery
  def spatial(): IndexCreationQuery
  def unique(): IndexCreationQuery
  def using(name: java.lang.String): IndexCreationQuery
  def withParser(parserName: java.lang.String): IndexCreationQuery
}

object IndexCreationQuery {
  @scala.inline
  def apply(
    fulltext: js.Function0[IndexCreationQuery],
    on: js.Function1[/* repeated */ (Column[_, _]) | OrderByValueNode, IndexCreationQuery],
    spatial: js.Function0[IndexCreationQuery],
    toQuery: js.Function0[QueryLike],
    unique: js.Function0[IndexCreationQuery],
    using: js.Function1[java.lang.String, IndexCreationQuery],
    withParser: js.Function1[java.lang.String, IndexCreationQuery]
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(fulltext = fulltext, on = on, spatial = spatial, toQuery = toQuery, unique = unique, using = using, withParser = withParser)
  
    __obj.asInstanceOf[IndexCreationQuery]
  }
}


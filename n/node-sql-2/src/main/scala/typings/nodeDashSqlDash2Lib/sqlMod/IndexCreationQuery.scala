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
    fulltext: () => IndexCreationQuery,
    on: /* repeated */ (Column[_, _]) | OrderByValueNode => IndexCreationQuery,
    spatial: () => IndexCreationQuery,
    toQuery: () => QueryLike,
    unique: () => IndexCreationQuery,
    using: java.lang.String => IndexCreationQuery,
    withParser: java.lang.String => IndexCreationQuery
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(fulltext = js.Any.fromFunction0(fulltext), on = js.Any.fromFunction1(on), spatial = js.Any.fromFunction0(spatial), toQuery = js.Any.fromFunction0(toQuery), unique = js.Any.fromFunction0(unique), using = js.Any.fromFunction1(using), withParser = js.Any.fromFunction1(withParser))
  
    __obj.asInstanceOf[IndexCreationQuery]
  }
}


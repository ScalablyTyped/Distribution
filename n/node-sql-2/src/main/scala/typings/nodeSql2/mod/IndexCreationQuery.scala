package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexCreationQuery
  extends StObject
     with Executable {
  
  def fulltext(): IndexCreationQuery
  
  def on(columns: ((Column[js.Any, js.Any]) | OrderByValueNode)*): IndexCreationQuery
  
  def spatial(): IndexCreationQuery
  
  def unique(): IndexCreationQuery
  
  def `using`(name: String): IndexCreationQuery
  
  def withParser(parserName: String): IndexCreationQuery
}
object IndexCreationQuery {
  
  @scala.inline
  def apply(
    fulltext: () => IndexCreationQuery,
    on: /* repeated */ (Column[js.Any, js.Any]) | OrderByValueNode => IndexCreationQuery,
    spatial: () => IndexCreationQuery,
    toQuery: () => QueryLike,
    unique: () => IndexCreationQuery,
    `using`: String => IndexCreationQuery,
    withParser: String => IndexCreationQuery
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(fulltext = js.Any.fromFunction0(fulltext), on = js.Any.fromFunction1(on), spatial = js.Any.fromFunction0(spatial), toQuery = js.Any.fromFunction0(toQuery), unique = js.Any.fromFunction0(unique), withParser = js.Any.fromFunction1(withParser))
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[IndexCreationQuery]
  }
  
  @scala.inline
  implicit class IndexCreationQueryMutableBuilder[Self <: IndexCreationQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFulltext(value: () => IndexCreationQuery): Self = StObject.set(x, "fulltext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: /* repeated */ (Column[js.Any, js.Any]) | OrderByValueNode => IndexCreationQuery): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpatial(value: () => IndexCreationQuery): Self = StObject.set(x, "spatial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnique(value: () => IndexCreationQuery): Self = StObject.set(x, "unique", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsing(value: String => IndexCreationQuery): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithParser(value: String => IndexCreationQuery): Self = StObject.set(x, "withParser", js.Any.fromFunction1(value))
  }
}

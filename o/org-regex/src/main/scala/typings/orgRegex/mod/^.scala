package typings.orgRegex.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("org-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /** 
  	@example
  	```
  	import orgRegex from  'org-regex';
  	orgRegex({exact: true}).test('@ava');
  	//=> true
  	'foo @ava bar @ava/init'.match(orgRegex());
  	//=> ['@ava']
  	```
  	*/
  def apply(): RegExp = js.native
  def apply(options: Options): RegExp = js.native
}

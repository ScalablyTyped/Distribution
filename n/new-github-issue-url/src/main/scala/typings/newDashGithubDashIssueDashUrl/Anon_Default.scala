package typings.newDashGithubDashIssueDashUrl

import typings.newDashGithubDashIssueDashUrl.newDashGithubDashIssueDashUrlMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Generate a URL for opening a new GitHub issue with prefilled title, body, and other fields.
  	@example
  	```
  	import newGithubIssueUrl = require('new-github-issue-url');
  	import opn = require('opn');
  	const url = newGithubIssueUrl({
  		user: 'sindresorhus',
  		repo: 'new-github-issue-url',
  		body: '\n\n\n---\nI\'m a human. Please be nice.'
  	});
  	//=> 'https://github.com/sindresorhus/new-github-issue-url/issues/new?body=%0A%0A%0A---%0AI%27m+a+human.+Please+be+nice.'
  	// Then open it
  	opn(url);
  	```
  	*/
  def apply(options: Options): String = js.native
}


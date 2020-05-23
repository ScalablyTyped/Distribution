package typings.mocha.Mocha

import typings.mocha.mochaStrings.`post-require`
import typings.mocha.mochaStrings.`pre-require`
import typings.mocha.mochaStrings.afterAll
import typings.mocha.mochaStrings.afterEach
import typings.mocha.mochaStrings.beforeAll
import typings.mocha.mochaStrings.beforeEach
import typings.mocha.mochaStrings.require
import typings.mocha.mochaStrings.run
import typings.mocha.mochaStrings.suite
import typings.mocha.mochaStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner untyped events
trait SuiteConstants extends js.Object {
  val EVENT_FILE_POST_REQUIRE: `post-require`
  val EVENT_FILE_PRE_REQUIRE: `pre-require`
  val EVENT_FILE_REQUIRE: require
  val EVENT_ROOT_SUITE_RUN: run
  val EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll
  val EVENT_SUITE_ADD_HOOK_AFTER_EACH: afterEach
  val EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll
  val EVENT_SUITE_ADD_HOOK_BEFORE_EACH: beforeEach
  val EVENT_SUITE_ADD_SUITE: suite
  val EVENT_SUITE_ADD_TEST: test
  val HOOK_TYPE_AFTER_ALL: afterAll
  val HOOK_TYPE_AFTER_EACH: afterEach
  val HOOK_TYPE_BEFORE_ALL: beforeAll
  val HOOK_TYPE_BEFORE_EACH: beforeEach
}

object SuiteConstants {
  @scala.inline
  def apply(
    EVENT_FILE_POST_REQUIRE: `post-require`,
    EVENT_FILE_PRE_REQUIRE: `pre-require`,
    EVENT_FILE_REQUIRE: require,
    EVENT_ROOT_SUITE_RUN: run,
    EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll,
    EVENT_SUITE_ADD_HOOK_AFTER_EACH: afterEach,
    EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll,
    EVENT_SUITE_ADD_HOOK_BEFORE_EACH: beforeEach,
    EVENT_SUITE_ADD_SUITE: suite,
    EVENT_SUITE_ADD_TEST: test,
    HOOK_TYPE_AFTER_ALL: afterAll,
    HOOK_TYPE_AFTER_EACH: afterEach,
    HOOK_TYPE_BEFORE_ALL: beforeAll,
    HOOK_TYPE_BEFORE_EACH: beforeEach
  ): SuiteConstants = {
    val __obj = js.Dynamic.literal(EVENT_FILE_POST_REQUIRE = EVENT_FILE_POST_REQUIRE.asInstanceOf[js.Any], EVENT_FILE_PRE_REQUIRE = EVENT_FILE_PRE_REQUIRE.asInstanceOf[js.Any], EVENT_FILE_REQUIRE = EVENT_FILE_REQUIRE.asInstanceOf[js.Any], EVENT_ROOT_SUITE_RUN = EVENT_ROOT_SUITE_RUN.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_AFTER_ALL = EVENT_SUITE_ADD_HOOK_AFTER_ALL.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_AFTER_EACH = EVENT_SUITE_ADD_HOOK_AFTER_EACH.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_BEFORE_ALL = EVENT_SUITE_ADD_HOOK_BEFORE_ALL.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_BEFORE_EACH = EVENT_SUITE_ADD_HOOK_BEFORE_EACH.asInstanceOf[js.Any], EVENT_SUITE_ADD_SUITE = EVENT_SUITE_ADD_SUITE.asInstanceOf[js.Any], EVENT_SUITE_ADD_TEST = EVENT_SUITE_ADD_TEST.asInstanceOf[js.Any], HOOK_TYPE_AFTER_ALL = HOOK_TYPE_AFTER_ALL.asInstanceOf[js.Any], HOOK_TYPE_AFTER_EACH = HOOK_TYPE_AFTER_EACH.asInstanceOf[js.Any], HOOK_TYPE_BEFORE_ALL = HOOK_TYPE_BEFORE_ALL.asInstanceOf[js.Any], HOOK_TYPE_BEFORE_EACH = HOOK_TYPE_BEFORE_EACH.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteConstants]
  }
}


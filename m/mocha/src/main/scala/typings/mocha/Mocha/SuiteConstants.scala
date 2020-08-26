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
@js.native
trait SuiteConstants extends js.Object {
  val EVENT_FILE_POST_REQUIRE: `post-require` = js.native
  val EVENT_FILE_PRE_REQUIRE: `pre-require` = js.native
  val EVENT_FILE_REQUIRE: require = js.native
  val EVENT_ROOT_SUITE_RUN: run = js.native
  val EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll = js.native
  val EVENT_SUITE_ADD_HOOK_AFTER_EACH: afterEach = js.native
  val EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll = js.native
  val EVENT_SUITE_ADD_HOOK_BEFORE_EACH: beforeEach = js.native
  val EVENT_SUITE_ADD_SUITE: suite = js.native
  val EVENT_SUITE_ADD_TEST: test = js.native
  val HOOK_TYPE_AFTER_ALL: afterAll = js.native
  val HOOK_TYPE_AFTER_EACH: afterEach = js.native
  val HOOK_TYPE_BEFORE_ALL: beforeAll = js.native
  val HOOK_TYPE_BEFORE_EACH: beforeEach = js.native
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
  @scala.inline
  implicit class SuiteConstantsOps[Self <: SuiteConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEVENT_FILE_POST_REQUIRE(value: `post-require`): Self = this.set("EVENT_FILE_POST_REQUIRE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_FILE_PRE_REQUIRE(value: `pre-require`): Self = this.set("EVENT_FILE_PRE_REQUIRE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_FILE_REQUIRE(value: require): Self = this.set("EVENT_FILE_REQUIRE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_ROOT_SUITE_RUN(value: run): Self = this.set("EVENT_ROOT_SUITE_RUN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_HOOK_AFTER_ALL(value: afterAll): Self = this.set("EVENT_SUITE_ADD_HOOK_AFTER_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_HOOK_AFTER_EACH(value: afterEach): Self = this.set("EVENT_SUITE_ADD_HOOK_AFTER_EACH", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_HOOK_BEFORE_ALL(value: beforeAll): Self = this.set("EVENT_SUITE_ADD_HOOK_BEFORE_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_HOOK_BEFORE_EACH(value: beforeEach): Self = this.set("EVENT_SUITE_ADD_HOOK_BEFORE_EACH", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_SUITE(value: suite): Self = this.set("EVENT_SUITE_ADD_SUITE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SUITE_ADD_TEST(value: test): Self = this.set("EVENT_SUITE_ADD_TEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOOK_TYPE_AFTER_ALL(value: afterAll): Self = this.set("HOOK_TYPE_AFTER_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOOK_TYPE_AFTER_EACH(value: afterEach): Self = this.set("HOOK_TYPE_AFTER_EACH", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOOK_TYPE_BEFORE_ALL(value: beforeAll): Self = this.set("HOOK_TYPE_BEFORE_ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOOK_TYPE_BEFORE_EACH(value: beforeEach): Self = this.set("HOOK_TYPE_BEFORE_EACH", value.asInstanceOf[js.Any])
  }
  
}


package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * We need to inline the codes in order to make compilation work without this type definition as dependency.
  */
/* Rewritten from type alias, can be one of: 
  - parseLib.parseLibNumbers.`-1`
  - parseLib.parseLibNumbers.`1`
  - parseLib.parseLibNumbers.`100`
  - parseLib.parseLibNumbers.`101`
  - parseLib.parseLibNumbers.`102`
  - parseLib.parseLibNumbers.`103`
  - parseLib.parseLibNumbers.`104`
  - parseLib.parseLibNumbers.`105`
  - parseLib.parseLibNumbers.`106`
  - parseLib.parseLibNumbers.`107`
  - parseLib.parseLibNumbers.`108`
  - parseLib.parseLibNumbers.`109`
  - parseLib.parseLibNumbers.`111`
  - parseLib.parseLibNumbers.`112`
  - parseLib.parseLibNumbers.`115`
  - parseLib.parseLibNumbers.`116`
  - parseLib.parseLibNumbers.`119`
  - parseLib.parseLibNumbers.`120`
  - parseLib.parseLibNumbers.`121`
  - parseLib.parseLibNumbers.`122`
  - parseLib.parseLibNumbers.`123`
  - parseLib.parseLibNumbers.`124`
  - parseLib.parseLibNumbers.`125`
  - parseLib.parseLibNumbers.`126`
  - parseLib.parseLibNumbers.`127`
  - parseLib.parseLibNumbers.`128`
  - parseLib.parseLibNumbers.`129`
  - parseLib.parseLibNumbers.`130`
  - parseLib.parseLibNumbers.`137`
  - parseLib.parseLibNumbers.`139`
  - parseLib.parseLibNumbers.`140`
  - parseLib.parseLibNumbers.`141`
  - parseLib.parseLibNumbers.`142`
  - parseLib.parseLibNumbers.`150`
  - parseLib.parseLibNumbers.`151`
  - parseLib.parseLibNumbers.`152`
  - parseLib.parseLibNumbers.`153`
  - parseLib.parseLibNumbers.`155`
  - parseLib.parseLibNumbers.`160`
  - parseLib.parseLibNumbers.`200`
  - parseLib.parseLibNumbers.`201`
  - parseLib.parseLibNumbers.`202`
  - parseLib.parseLibNumbers.`203`
  - parseLib.parseLibNumbers.`204`
  - parseLib.parseLibNumbers.`205`
  - parseLib.parseLibNumbers.`206`
  - parseLib.parseLibNumbers.`207`
  - parseLib.parseLibNumbers.`208`
  - parseLib.parseLibNumbers.`209`
  - parseLib.parseLibNumbers.`250`
  - parseLib.parseLibNumbers.`251`
  - parseLib.parseLibNumbers.`252`
  - parseLib.parseLibNumbers.`600`
  - parseLib.parseLibNumbers.`601`
  - parseLib.parseLibNumbers.`602`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def ACCOUNT_ALREADY_LINKED: parseLib.parseLibNumbers.`208` = this.cast(208)
  @scala.inline
  def AGGREGATE_ERROR: parseLib.parseLibNumbers.`600` = this.cast(600)
  @scala.inline
  def CACHE_MISS: parseLib.parseLibNumbers.`120` = this.cast(120)
  @scala.inline
  def COMMAND_UNAVAILABLE: parseLib.parseLibNumbers.`108` = this.cast(108)
  @scala.inline
  def CONNECTION_FAILED: parseLib.parseLibNumbers.`100` = this.cast(100)
  @scala.inline
  def DUPLICATE_VALUE: parseLib.parseLibNumbers.`137` = this.cast(137)
  @scala.inline
  def EMAIL_MISSING: parseLib.parseLibNumbers.`204` = this.cast(204)
  @scala.inline
  def EMAIL_NOT_FOUND: parseLib.parseLibNumbers.`205` = this.cast(205)
  @scala.inline
  def EMAIL_TAKEN: parseLib.parseLibNumbers.`203` = this.cast(203)
  @scala.inline
  def EXCEEDED_QUOTA: parseLib.parseLibNumbers.`140` = this.cast(140)
  @scala.inline
  def FILE_DELETE_ERROR: parseLib.parseLibNumbers.`153` = this.cast(153)
  @scala.inline
  def FILE_READ_ERROR: parseLib.parseLibNumbers.`601` = this.cast(601)
  @scala.inline
  def FILE_SAVE_ERROR: parseLib.parseLibNumbers.`130` = this.cast(130)
  @scala.inline
  def FILE_TOO_LARGE: parseLib.parseLibNumbers.`129` = this.cast(129)
  @scala.inline
  def INCORRECT_TYPE: parseLib.parseLibNumbers.`111` = this.cast(111)
  @scala.inline
  def INTERNAL_SERVER_ERROR: parseLib.parseLibNumbers.`1` = this.cast(1)
  @scala.inline
  def INVALID_ACL: parseLib.parseLibNumbers.`123` = this.cast(123)
  @scala.inline
  def INVALID_CHANNEL_NAME: parseLib.parseLibNumbers.`112` = this.cast(112)
  @scala.inline
  def INVALID_CLASS_NAME: parseLib.parseLibNumbers.`103` = this.cast(103)
  @scala.inline
  def INVALID_CONTENT_LENGTH: parseLib.parseLibNumbers.`128` = this.cast(128)
  @scala.inline
  def INVALID_EMAIL_ADDRESS: parseLib.parseLibNumbers.`125` = this.cast(125)
  @scala.inline
  def INVALID_EVENT_NAME: parseLib.parseLibNumbers.`160` = this.cast(160)
  @scala.inline
  def INVALID_FILE_NAME: parseLib.parseLibNumbers.`122` = this.cast(122)
  @scala.inline
  def INVALID_IMAGE_DATA: parseLib.parseLibNumbers.`150` = this.cast(150)
  @scala.inline
  def INVALID_JSON: parseLib.parseLibNumbers.`107` = this.cast(107)
  @scala.inline
  def INVALID_KEY_NAME: parseLib.parseLibNumbers.`105` = this.cast(105)
  @scala.inline
  def INVALID_LINKED_SESSION: parseLib.parseLibNumbers.`251` = this.cast(251)
  @scala.inline
  def INVALID_NESTED_KEY: parseLib.parseLibNumbers.`121` = this.cast(121)
  @scala.inline
  def INVALID_POINTER: parseLib.parseLibNumbers.`106` = this.cast(106)
  @scala.inline
  def INVALID_PUSH_TIME_ERROR: parseLib.parseLibNumbers.`152` = this.cast(152)
  @scala.inline
  def INVALID_QUERY: parseLib.parseLibNumbers.`102` = this.cast(102)
  @scala.inline
  def INVALID_ROLE_NAME: parseLib.parseLibNumbers.`139` = this.cast(139)
  @scala.inline
  def INVALID_SESSION_TOKEN: parseLib.parseLibNumbers.`209` = this.cast(209)
  @scala.inline
  def LINKED_ID_MISSING: parseLib.parseLibNumbers.`250` = this.cast(250)
  @scala.inline
  def MISSING_CONTENT_LENGTH: parseLib.parseLibNumbers.`127` = this.cast(127)
  @scala.inline
  def MISSING_CONTENT_TYPE: parseLib.parseLibNumbers.`126` = this.cast(126)
  @scala.inline
  def MISSING_OBJECT_ID: parseLib.parseLibNumbers.`104` = this.cast(104)
  @scala.inline
  def MUST_CREATE_USER_THROUGH_SIGNUP: parseLib.parseLibNumbers.`207` = this.cast(207)
  @scala.inline
  def NOT_INITIALIZED: parseLib.parseLibNumbers.`109` = this.cast(109)
  @scala.inline
  def OBJECT_NOT_FOUND: parseLib.parseLibNumbers.`101` = this.cast(101)
  @scala.inline
  def OBJECT_TOO_LARGE: parseLib.parseLibNumbers.`116` = this.cast(116)
  @scala.inline
  def OPERATION_FORBIDDEN: parseLib.parseLibNumbers.`119` = this.cast(119)
  @scala.inline
  def OTHER_CAUSE: parseLib.parseLibNumbers.`-1` = this.cast(-1)
  @scala.inline
  def PASSWORD_MISSING: parseLib.parseLibNumbers.`201` = this.cast(201)
  @scala.inline
  def PUSH_MISCONFIGURED: parseLib.parseLibNumbers.`115` = this.cast(115)
  @scala.inline
  def REQUEST_LIMIT_EXCEEDED: parseLib.parseLibNumbers.`155` = this.cast(155)
  @scala.inline
  def SCRIPT_FAILED: parseLib.parseLibNumbers.`141` = this.cast(141)
  @scala.inline
  def SESSION_MISSING: parseLib.parseLibNumbers.`206` = this.cast(206)
  @scala.inline
  def TIMEOUT: parseLib.parseLibNumbers.`124` = this.cast(124)
  @scala.inline
  def UNSAVED_FILE_ERROR: parseLib.parseLibNumbers.`151` = this.cast(151)
  @scala.inline
  def UNSUPPORTED_SERVICE: parseLib.parseLibNumbers.`252` = this.cast(252)
  @scala.inline
  def USERNAME_MISSING: parseLib.parseLibNumbers.`200` = this.cast(200)
  @scala.inline
  def USERNAME_TAKEN: parseLib.parseLibNumbers.`202` = this.cast(202)
  @scala.inline
  def VALIDATION_ERROR: parseLib.parseLibNumbers.`142` = this.cast(142)
  @scala.inline
  def X_DOMAIN_REQUEST: parseLib.parseLibNumbers.`602` = this.cast(602)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


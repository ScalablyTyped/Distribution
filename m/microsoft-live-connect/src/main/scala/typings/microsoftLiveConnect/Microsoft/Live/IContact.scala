package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Contact object contains info about a user's Outlook.com contacts. The
  * Live Connect REST API supports reading Contact objects.
  */
@js.native
trait IContact extends js.Object {
  /**
    * The day of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: Double = js.native
  /**
    * The month of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: Double = js.native
  /**
    * An array containing a SHA-256 hash for each of the contact's email
    * addresses. For more info, see Friend finder.
    */
  var email_hashes: js.Array[String] = js.native
  /**
    * The contact's first name, or null if no first name is specified.
    */
  var first_name: String = js.native
  /**
    * The Contact object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether the contact is set as a favorite
    * contact. If the contact is a favorite, this value is true; otherwise,
    * it is false.
    */
  var is_favorite: Boolean = js.native
  /**
    * A value that indicates whether the contact is set as a friend. If the
    * contact is a friend, this value is true; otherwise, it is false.
    */
  var is_friend: Boolean = js.native
  /**
    * The contact's last name, or null if no last name is specified.
    */
  var last_name: String = js.native
  /**
    * The contact's full name, formatted for location.
    */
  var name: String = js.native
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * data.
    */
  var updated_time: String = js.native
  /**
    * The contact's ID, if the contact has one. If not, this value is null.
    */
  var user_id: String = js.native
}

object IContact {
  @scala.inline
  def apply(
    birth_day: Double,
    birth_month: Double,
    email_hashes: js.Array[String],
    first_name: String,
    id: String,
    is_favorite: Boolean,
    is_friend: Boolean,
    last_name: String,
    name: String,
    updated_time: String,
    user_id: String
  ): IContact = {
    val __obj = js.Dynamic.literal(birth_day = birth_day.asInstanceOf[js.Any], birth_month = birth_month.asInstanceOf[js.Any], email_hashes = email_hashes.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_friend = is_friend.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContact]
  }
  @scala.inline
  implicit class IContactOps[Self <: IContact] (val x: Self) extends AnyVal {
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
    def setBirth_day(value: Double): Self = this.set("birth_day", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_month(value: Double): Self = this.set("birth_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail_hashesVarargs(value: String*): Self = this.set("email_hashes", js.Array(value :_*))
    @scala.inline
    def setEmail_hashes(value: js.Array[String]): Self = this.set("email_hashes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_favorite(value: Boolean): Self = this.set("is_favorite", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_friend(value: Boolean): Self = this.set("is_friend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
  }
  
}

